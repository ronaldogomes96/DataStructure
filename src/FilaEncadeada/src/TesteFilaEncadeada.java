public class TesteFilaEncadeada {

    public static void main(String[] args) {
        TADFilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.imprimeFila();

        fila.insereFinal(10);
        fila.imprimeFila();

        fila.insereFinal(12);
        fila.imprimeFila();

        fila.insereFinal(14);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.insereFinal(20);
        fila.imprimeFila();

        fila.insereFinal(22);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();
    }
}
