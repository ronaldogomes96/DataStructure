public interface TADListaEncadeadaString<T> {
    /**
     * Operacoes principais
     */
    public void insereInicio(T valor);
    public void inserePosicao(T valor, int posicao);
    public void insereFinal(T valor);

    public T removePosicao(int posicao);
    public void removeNoComString(T caractere);

    /**
     * Operacoes secundarias
     */
    public boolean listaVazia();
    public void imprimeLista();
}
