public interface TADListaEncadeadaOrdenada<T> {

    /**
     * Operacoes principais
     */
    public void insereInicio(T valor);
    public void inserePosicao(T valor, int posicao);
    public void insereFinal(T valor);

    public void insereOrdenado(T valor);

    public T removePosicao(int posicao);

    /**
     * Operacoes secundarias
     */
    public boolean listaVazia();
    public void imprimeLista();
}
