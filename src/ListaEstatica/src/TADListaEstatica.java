public interface TADListaEstatica<E> {
    /**
     * Operações básicas
     *
     */

    public abstract E set(int pos, E e);

    public abstract void addPrimeiro(E e);
    public abstract void addUltimo(E e);

    public abstract void addAntes(int pos, E e);
    public abstract void addApos(int pos, E e);

    public abstract void remove(E e);
    public abstract void remove(int pos);

    /**
     * Operações auxiliares
     */

    public abstract E fisrt();
    public abstract E last();

    public abstract void imprimeLista();
    public abstract boolean listaCheia();
    public abstract boolean listaVazia();
}
