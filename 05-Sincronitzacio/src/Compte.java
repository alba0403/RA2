public class Compte {
    private float saldo;
    private static Compte instancia = null;    // Singleton -> unica instancia
    
    // Constructor
    private Compte() {
        saldo = 0.0f;
    }
    
    //getters i setters
    public static Compte getInstancia() {
        if (instancia == null) {
            instancia = new Compte();
        }
        return instancia;
    }
    public float getSaldo() { return saldo; }
    public void setSaldo(float saldo) { this.saldo = saldo; }

    
    // mètodes
    public synchronized void ingresa(float quantitat) {
        saldo += quantitat;
    }
    public synchronized void retira(float quantitat) {
        saldo -= quantitat;
    }

}
