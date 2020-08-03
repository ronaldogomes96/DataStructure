public class TesteFila {
    public static void main(String[] args) {

        Fila fila = new FilaImpl(5);

        fila.imprimeFila();

        fila.insereFinal(5);
        fila.imprimeFila();

        fila.insereFinal(3);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.insereFinal(2);
        fila.imprimeFila();

        fila.insereFinal(8);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.insereFinal(9);
        fila.imprimeFila();

        fila.insereFinal(1);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.insereFinal(7);
        fila.imprimeFila();

        fila.insereFinal(6);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.insereFinal(4);
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

        fila.removeInicio();
        fila.imprimeFila();

    }

}
