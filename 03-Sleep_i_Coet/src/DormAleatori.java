public class DormAleatori extends Thread {

    private long instantCreacio;

    // Constructor
    public DormAleatori(String nom) {
        this.setName(nom);                                      // obteninm el name del Thread
        this.instantCreacio = System.currentTimeMillis();       // moment exacte de la construcció
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {                         // repetim l'execucio 10 vegades

            long intervalAleatori = Math.random() * 1500;        // Interval aleatori entre 500 i 2000 ms

            long tempsActual = System.currentTimeMillis();
            long tempsTotal = tempsActual - instantCreacio;

        }
    }

    
    public static void main(String[] args) {                    // Mètode principal
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");

        joan.start();
        pep.start();

        System.out.println("---- Fi del main -------");
    }
}