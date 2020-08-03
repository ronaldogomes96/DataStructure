interface Lista {

    /**
     * Operações básicas
     *
     */
    void AdicionaInicio(Integer valor);

    void AdicionaFim(Integer valor);

    void AdicionaMeio(Integer valor, Integer posi);

    Integer RemoveInicio();

    Integer RemoveFim();

    Integer RemovePosicao(int posi);


    /**
     * Operações auxiliares
     */
    boolean ListaCheia();
    boolean ListaVazia();

    void imprimeLista();
}
