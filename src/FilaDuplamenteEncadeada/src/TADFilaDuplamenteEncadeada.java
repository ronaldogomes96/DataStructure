public interface TADFilaDuplamenteEncadeada<T> {
    //Operacoes principais
    public void insereFinal (T valor);
    public T removeInicio();

    //Operacoes secundarias
    public boolean filaVazia();
    public void imprimeFila();
}
