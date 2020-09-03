public class TesteDuplamenteEncadeada {
    public static void main(String[] args) {
        TADListaDuplamenteEncadeada<Integer> listaDuplamenteEncadeada = new ListDuplamenteEncadeada<Integer>();

        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.insereValor(1, 1);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.insereValor(2, 1);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.insereValor(6, 3);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.insereValor(0, 5);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.insereValor(3, 2);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.removeValor(3);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.removeValor(1);
        listaDuplamenteEncadeada.imprimeLista();

        listaDuplamenteEncadeada.removeValor(9);
        listaDuplamenteEncadeada.imprimeLista();
    }
}
