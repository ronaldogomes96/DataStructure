public class PilhaImpl implements Pilha {

    private Integer[] pilha;
    private int posicao;

    public PilhaImpl(int tamanho) {
        pilha = new Integer[tamanho];
        posicao = -1;
    }

    @Override
    public Integer insereTopo(Integer valor) {
        //Realiza as validações
        if (pilhaCheia()) {
            System.out.println("Pilha Cheia. Elemento não inserido.");
            return null;
        }

        for (int i = posicao; i >= 0; i--) {
            pilha[i + 1] = pilha[i];
        }


        pilha[0] = valor;
        return  ++posicao;
    }

    @Override
    public Integer removeTopo() {

        if (pilhaVazia()) {
            System.out.println("Pilha Vazia. Não há elemento para remoção.");
            return null;
        }

        int elementoRemovido = pilha[0];

        for (int i = 0; i < posicao; i++) {
            pilha[i] = pilha[i + 1];
        }

        pilha[posicao--] = null;


        return elementoRemovido;
    }


    public boolean pilhaCheia() {
        if (posicao == pilha.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean pilhaVazia() {
        return posicao == -1 ? true : false;
    }

    @Override
    public void imprimePilha() {

        if (pilhaVazia()) {
            System.out.println("Pilha Vazia. Não há elementos para impressão");
            return;
        }

        for (int i = 0; i <= posicao; i++) {
            System.out.print(pilha[i] + "\t");
        }
        System.out.println();


    }

}