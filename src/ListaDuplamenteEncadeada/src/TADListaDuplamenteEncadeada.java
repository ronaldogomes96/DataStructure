public interface TADListaDuplamenteEncadeada<T> {

    /**
     * Operacoes principais
     */
    public void insereValor(T valor, int posicao);
    public T removeValor(int posicao);

    /**
     * Operacoes secundarias
     */
    public boolean listaVazia();
    public void imprimeLista();
}