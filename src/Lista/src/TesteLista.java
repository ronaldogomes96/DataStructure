public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new ListaImpl(5);

        lista.imprimeLista();

        lista.AdicionaInicio(10);
        lista.imprimeLista();

        lista.AdicionaFim(12);
        lista.imprimeLista();

        lista.AdicionaInicio(8);
        lista.imprimeLista();

        lista.AdicionaMeio(9, 3);
        lista.imprimeLista();

        lista.AdicionaMeio(11, 3);
        lista.imprimeLista();

        lista.AdicionaFim(14);

        lista.RemoveFim();
        lista.imprimeLista();

        lista.RemoveInicio();
        lista.imprimeLista();

        lista.RemovePosicao(7);
        lista.imprimeLista();



    }
}
