public class TesteListaEstatico {
    public static void main(String[] args) {
        ListaEstaticaImpl<Integer> lista = new ListaEstaticaImpl<Integer>(10);

        lista.imprimeLista();

        lista.addPrimeiro(2);
        lista.imprimeLista();

        lista.addPrimeiro(1);
        lista.imprimeLista();

        lista.addUltimo(3);
        lista.imprimeLista();

        lista.set(1,4);
        lista.imprimeLista();

        lista.addAntes(2, 5);
        lista.imprimeLista();

        lista.addApos(2,6);
        lista.imprimeLista();

        lista.remove(2);
        lista.imprimeLista();

    }
}
