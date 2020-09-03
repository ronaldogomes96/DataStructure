public class ListDuplamenteEncadeada<T> implements TADListaDuplamenteEncadeada<T> {

    private No<T> header;
    private No<T> trailer;
    private int tamanho;

    public ListDuplamenteEncadeada() {
        header = new No(null, null, null);
        trailer = new No(null, null, header);

        header.setProximo(trailer);
        tamanho = 0;
    }

    @Override
    public void insereValor(T valor, int posicao) {

        if (posicao < 1 || posicao > tamanho+1 ){
            System.out.println("Posicao fora de range");
            return;
        }

        No<T> noAnteriorInsercao = header;

        for(int i = 1; i < posicao; i++) {
            noAnteriorInsercao = noAnteriorInsercao.getProximo();
        }

        No<T> novoNo = new No<T>(valor, null, noAnteriorInsercao);
        novoNo.setProximo(noAnteriorInsercao.getProximo());
        novoNo.getProximo().setAnterior(noAnteriorInsercao);

        noAnteriorInsercao.setProximo(novoNo);

        tamanho++;

    }

    @Override
    public T removeValor(int posicao) {

        if (posicao < 1 || posicao > tamanho ){
            System.out.println("Posicao fora de range");
            return null;
        }

        No<T> noAnteriorRemocao = header;

        for(int i = 1; i < posicao; i++) {
            noAnteriorRemocao = noAnteriorRemocao.getProximo();
        }

        No<T> noRemovido = noAnteriorRemocao.getProximo();

        noAnteriorRemocao.setProximo(noRemovido.getProximo());
        noRemovido.getProximo().setAnterior(noAnteriorRemocao);

        noRemovido.setProximo(null);
        noRemovido.setAnterior(null);

        tamanho--;

        return noRemovido.getValor();
    }

    @Override
    public boolean listaVazia() {

        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void imprimeLista() {

        if(listaVazia()) {
            System.out.println("Lista Vazia. Não há elementos para impressão");
            return;
        }

        No<T> auxiliar = header;

        while(auxiliar != null) {
            System.out.print(" => " + auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println();
    }
}
