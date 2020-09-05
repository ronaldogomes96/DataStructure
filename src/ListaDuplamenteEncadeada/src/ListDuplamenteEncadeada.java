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

        No<T> noAnteriorInsercao;
        No<T> novoNo;

        if ((tamanho / 2) > posicao) {

            noAnteriorInsercao = header;
            for(int i = 1; i < posicao; i++) {
                noAnteriorInsercao = noAnteriorInsercao.getProximo();
            }
            novoNo = new No<T>(valor, null, noAnteriorInsercao);
            novoNo.setProximo(noAnteriorInsercao.getProximo());
            novoNo.getProximo().setAnterior(noAnteriorInsercao);

            noAnteriorInsercao.setProximo(novoNo);

        } else {

            noAnteriorInsercao = trailer;
            for(int i = tamanho; i >= posicao; i--) {
                noAnteriorInsercao = noAnteriorInsercao.getAnterior();
            }

            novoNo = new No<T>(valor, noAnteriorInsercao, null);
            novoNo.setAnterior(noAnteriorInsercao.getAnterior());
            noAnteriorInsercao.getAnterior().setProximo(novoNo);
            novoNo.getProximo().setAnterior(novoNo);


        }

        tamanho++;
    }

    @Override
    public T removeValor(int posicao) {

        if (posicao < 1 || posicao > tamanho ){
            System.out.println("Posicao fora de range");
            return null;
        }

        No<T> noAnteriorRemocao;
        No<T> noRemovido;

        if ((tamanho / 2) > posicao) {

            noAnteriorRemocao = header;

            for(int i = 1; i < posicao; i++) {
                noAnteriorRemocao = noAnteriorRemocao.getProximo();
            }

            noRemovido = noAnteriorRemocao.getProximo();

            noAnteriorRemocao.setProximo(noRemovido.getProximo());
            noRemovido.getProximo().setAnterior(noAnteriorRemocao);

            noRemovido.setProximo(null);
            noRemovido.setAnterior(null);

        } else {

            noAnteriorRemocao = trailer;
            for(int i = tamanho; i > posicao; i--) {
                noAnteriorRemocao = noAnteriorRemocao.getAnterior();
            }

            noRemovido = noAnteriorRemocao.getAnterior();

            noAnteriorRemocao.setAnterior(noRemovido.getAnterior());
            noRemovido.getAnterior().setProximo(noAnteriorRemocao);

            noRemovido.setProximo(null);
            noRemovido.setAnterior(null);
        }

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
