public class TesteListaEncadeadaOrdenada {

    public static void main(String[] args) {

        TADListaEncadeadaOrdenada<Integer> listaEncadeadaOrdenada = new ListaEncadeadaOrdenada<Integer>();

        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereInicio(4);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereInicio(2);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereFinal(6);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereFinal(8);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereOrdenado(3);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereOrdenado(1);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereOrdenado(7);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereOrdenado(9);
        listaEncadeadaOrdenada.imprimeLista();

    }
}
