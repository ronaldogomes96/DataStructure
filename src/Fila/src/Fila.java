public interface Fila {
    /**
     * Operações básicas
     *
     */
    public void insereFinal(Integer valor);
    public Integer removeInicio();

    /**
     * Operações auxiliares
     */
    public boolean filaCheia();
    public boolean filaVazia();

    public void imprimeFila();
}
