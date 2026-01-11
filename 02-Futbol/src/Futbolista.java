/**
 * Classe que representa un futbolista que extendeix de Thread.
 */
public class Futbolista extends Thread{
    // Constants
    static final int NUM_JUGADORS = 11;
    static final int NUM_TIRADES = 20;
    static final float PROBABILITAT = 0.5f;
    
    // Atributs
    private int ngols;
    private int ntirades;

    // Constructor
    public Futbolista(String nomFutbolista){
        super(nomFutbolista);
        this.ngols = 0;
        this.ntirades = 0;
    }

    // Mètode encarregat de sumar el gol si en nombre a l'atzar està dins de la probabilitat
    @Override
    public void run(){
        for(int i = 0; i < NUM_TIRADES; i++){
            ntirades++;
            if(Math.random() <= PROBABILITAT){
                ngols++;
            }
        }
    }

    public static void main(String[] args) {
        // crear els fils
        Futbolista pique = new Futbolista("Piqué");
        Futbolista vinicius = new Futbolista("Vinicius");
        Futbolista torres = new Futbolista("Torres");
        Futbolista ramos = new Futbolista("Ramos");
        Futbolista ronaldo = new Futbolista("Ronaldo");
        Futbolista lewan = new Futbolista("Lewan");
        Futbolista belli = new Futbolista("Belli");
        Futbolista arnau = new Futbolista("Arnau");
        Futbolista aspas = new Futbolista("Aspas");
        Futbolista messi = new Futbolista("Messi");
        Futbolista mbape = new Futbolista("MBapé");

        Futbolista[] jugadors = {pique, vinicius, torres, ramos, ronaldo, lewan, belli, arnau, aspas, messi, mbape};
        
        // iniciar els fils
        for (Futbolista futbolista : jugadors) {
                futbolista.start();
        }

        // esperar a que acabin
        try{
            for (Futbolista futbolista : jugadors) {
                futbolista.join();
            }
        } catch (InterruptedException e) {  // join() només pot llençar aquesta excepció
            System.out.println("Error ocorregut; un fil ha estat interromput mentre s'esperaba que finalitzés: " + e);
        }

    
        System.out.printf("Inici dels xuts --------------\nFi dels xuts -----------------\n--------Estadístiques--------\n");
        for (Futbolista futbolista : jugadors) {
            System.out.printf("%-10s -> %2d gols\n", futbolista.getName(), futbolista.ngols);
        }
    }
}

