import java.util.Random;

public class Soci extends Thread {
    //atributs
    private Compte compte;
    private float aportacio = 10f;
    private int esperaMax = 100;
    private Random rnd;
    private int maxAnys = 10;

    //constructor
    public Soci(String nom) {
        super(nom);
        this.compte = Compte.getInstancia();
        this.rnd = new Random();
    }

    //getter
    public Compte getCompte() { return compte; }

    @Override
    public void run() {
        int mesos = maxAnys * 12; // calculem priemr el total de mesos a simular
        for (int mes = 0; mes < mesos; mes++) {
            try {
                if (mes % 2 == 0) { //mes parell
                    compte.ingresa(aportacio);
                } else { // imparell
                    compte.retira(aportacio);
                }
                Thread.sleep(rnd.nextInt(esperaMax)); //l'sleep simula el temps d'espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

