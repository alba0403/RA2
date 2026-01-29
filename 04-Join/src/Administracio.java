public class Administracio {
    // Atributs
    private static final int NUM_POBLACIO_ACTIVA = 50;
    private Treballador[] poblacioActiva;

    // constructor -- per crear els 50 treballadors
    public Administracio() {
        poblacioActiva = new Treballador[NUM_POBLACIO_ACTIVA];

        for (int i = 0; i < NUM_POBLACIO_ACTIVA; i++) {
            poblacioActiva[i] = new Treballador(
                "Ciutadà-" + i,
                25000,
                20,
                65
            );
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Administracio adminis = new Administracio();

        for (Treballador t : adminis.poblacioActiva) {
            t.start();
        }

        for (Treballador t : adminis.poblacioActiva) {
            t.join();   //fa que el fil principal es bloqueji fins que el fil termini el run
        }

        for (Treballador t : adminis.poblacioActiva) {
            System.out.printf(
                "%s -> edat: %d / total: %.2f\n",
                t.getName(),
                t.getEdat(),
                t.getCobrat()
            );
        }
    }

}
