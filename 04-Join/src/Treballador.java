/**
 * Cada treballador és un fil
 */
import java.util.Random;

public class Treballador extends Thread {
    // Atributs
    private float souAnualBrut;
    private int edatIniciTreball;
    private int edatFiTreball;
    private int edatActual;
    private float cobrat;
    private Random rnd;

    // constructors
    public Treballador(String nom, float sou, int edatInici, int edatFi) {
    super(nom);
    this.souAnualBrut = sou;
    this.edatIniciTreball = edatInici;
    this.edatFiTreball = edatFi;
    this.edatActual = 0;
    this.cobrat = 0.0f;
    this.rnd = new Random();
    }

    // mètodes
    public void cobra() {
        cobrat += souAnualBrut / 12;    //cada mes cobra 1/12 del sou anual, i ho acumulem a la variable cobrat
    }

    public void pagaImpostos() {
        cobrat -= (souAnualBrut / 12) * 0.24f;  //paga el 24% del sou mensual i es resta del total cobrat
    }

    @Override
    public void run() {
        for (edatActual = 0; edatActual < edatFiTreball; edatActual++) {   //for cada any de vida (fins65)

            if (edatActual >= edatIniciTreball) {   //nomes treballa entre els 20 i 65
                for (int mes = 0; mes < 12; mes++) {
                    cobra();
                    pagaImpostos();
                }
            }
        }
    }

    // Getters i setters
    public float getCobrat() { return cobrat; }
    public int getEdat() { return edatActual; }

}
