public class TestePilhaEncadeada {

    public static void main(String[] args) {
        TADPilhaEncadeada<Integer> pilha = new PilhaEncadeada<Integer>();
        pilha.imprimirPilha();

        pilha.insereInicio(10);
        pilha.imprimirPilha();

        pilha.insereInicio(12);
        pilha.imprimirPilha();

        pilha.insereInicio(14);
        pilha.imprimirPilha();

        pilha.removeInicio();
        pilha.imprimirPilha();

        pilha.removeInicio();
        pilha.imprimirPilha();

        pilha.insereInicio(20);
        pilha.imprimirPilha();

        pilha.insereInicio(22);
        pilha.imprimirPilha();

        pilha.removeInicio();
        pilha.imprimirPilha();

        pilha.removeInicio();
        pilha.imprimirPilha();
    }
}
