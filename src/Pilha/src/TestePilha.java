public class TestePilha {

    public static void main(String[] args) {

        Pilha pilha = new PilhaImpl(5);

        pilha.imprimePilha();

        pilha.insereTopo(5);
        pilha.imprimePilha();

        pilha.insereTopo(3);
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.insereTopo(2);
        pilha.imprimePilha();

        pilha.insereTopo(8);
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.insereTopo(9);
        pilha.imprimePilha();

        pilha.insereTopo(1);
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.insereTopo(7);
        pilha.imprimePilha();

        pilha.insereTopo(6);
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.insereTopo(4);
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

        pilha.removeTopo();
        pilha.imprimePilha();

    }

}
