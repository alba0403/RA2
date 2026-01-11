/**
 * Programa que té com a objectiu demostrar que tots els programes de Java
 * s'executen en un fil.
 */
public class MainDemoFil {
    public static void main(String[] args) {
        Thread filActual = Thread.currentThread();  //capturem el fil actual

        System.out.printf("Prioritat -> %d, Nom -> %s \ntoString() -> %s", filActual.getPriority(), filActual.getName(), filActual.toString());
    }
}
