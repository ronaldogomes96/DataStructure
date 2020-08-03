public interface Pilha {

    /**
     * Operações básicas
     *
     */
    public Integer insereTopo(Integer valor);
    public Integer removeTopo();

    /**
     * Operações auxiliares
     */
    public boolean pilhaCheia();
    public boolean pilhaVazia();

    public void imprimePilha();
}
