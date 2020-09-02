
public interface TADPilhaDuplamenteEncadeada<T> {
    //Operacoes principais
    public void insereFinal (T valor);
    public T removeFinal();

    //Operacoes secundarias
    public boolean filaVazia();
    public void imprimeFila();

}
