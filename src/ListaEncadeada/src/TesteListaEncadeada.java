public class TesteListaEncadeada {

    public static void main(String[] args) {
        TADListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaInicio(10);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaFim(20);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaMeio(12,1);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaMeio(14,2);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaMeio(18,3);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaMeio(16,3);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaFim(22);
        listaEncadeada.ImprimirFila();

        listaEncadeada.AdicionaInicio(8);
        listaEncadeada.ImprimirFila();

        listaEncadeada.RemoveInicio();
        listaEncadeada.ImprimirFila();

        listaEncadeada.RemoveInicio();
        listaEncadeada.ImprimirFila();

        listaEncadeada.RemoveFim();
        listaEncadeada.ImprimirFila();

        listaEncadeada.RemovePosicao(2);
        listaEncadeada.ImprimirFila();
    }
}
