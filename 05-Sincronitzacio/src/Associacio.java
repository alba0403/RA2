public class Associacio {
    //atribtus
    private int numSocis = 1000;
    private Soci[] socis;

    // constructor
    public Associacio() {
        socis = new Soci[numSocis];
        for (int i = 0; i < numSocis; i++) {
            socis[i] = new Soci("Soci-" + i);
        }
    }

    public void iniciaCompteTempsSocis() { //iniciem tots els fils
        for (Soci s : socis) {
            s.start();
        }
    }

    public void esperaPeriodeSocis() {  //join per esperar a que tots terminin
        for (Soci s : socis) {
            try {
                s.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // mètode de sortida
    public void mostraBalancComptes() {
        System.out.printf("Saldo final del compte: %.2f\n", Compte.getInstancia().getSaldo());
    }

    public static void main(String[] args) {
        Associacio associacio = new Associacio();
        associacio.iniciaCompteTempsSocis();
        associacio.esperaPeriodeSocis();
        associacio.mostraBalancComptes();
    }
}

