public class TestePilhaDuplamenteEncadeada {
    public static void main(String[] args) {
        TADPilhaDuplamenteEncadeada<Integer> pilha = new PilhaDuplamenteEncadeada<Integer>();

        pilha.imprimeFila();

        pilha.insereFinal(10);
        pilha.imprimeFila();

        pilha.insereFinal(12);
        pilha.imprimeFila();

        pilha.insereFinal(14);
        pilha.imprimeFila();

        pilha.removeFinal();
        pilha.imprimeFila();

        pilha.removeFinal();
        pilha.imprimeFila();

        pilha.insereFinal(20);
        pilha.imprimeFila();

        pilha.insereFinal(22);
        pilha.imprimeFila();

        pilha.removeFinal();
        pilha.imprimeFila();

        pilha.removeFinal();
        pilha.imprimeFila();
    }
}
