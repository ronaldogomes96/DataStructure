public interface TADListaEncadeada<T> {

    //Operacoes basicas
    void AdicionaInicio(T valor);
    void AdicionaFim(T valor);
    void AdicionaMeio(T valor, Integer posicao);

    T RemoveFim();
    T RemoveInicio();
    T RemovePosicao(Integer posicao);

    //Operacoes auxiliares
    boolean ListaVazia();
    void ImprimirFila();
}
