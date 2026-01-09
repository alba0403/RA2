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

    // Constructors
    public Futbolista(String nomFutbolista){
        super(nomFutbolista);
        this.ngols = 0;
        this.ntirades = 0;
    }

    // Mètode run
    @Override
    public void run(){
        for(int i = 0; i < NUM_TIRADES; i++){
            

        }
    
    
    }

    // Mètode main
    public static void main(String[] args) {
        // crear fil
        Futbolista pique = new Futbolista("Piqué");

        // iniciar fil
        pique.start();
        // esperar a que acabi
        // mostrar les estadístiques dels xuts

        System.out.printf("Inici dels xuts --------------\n Fi dels xuts -----------------\n --------Estadístiques--------\n");
        

    }
}

