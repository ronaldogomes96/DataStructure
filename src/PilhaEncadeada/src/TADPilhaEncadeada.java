
public interface TADPilhaEncadeada<T> {

    // Operacoes principais
    public void insereInicio(T valor);
    public T removeInicio();

    // Operacoes secundarias
    public boolean pilhaVazia();
    public void imprimirPilha();
}
