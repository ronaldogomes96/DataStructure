public class PilhaDuplamenteEncadeada<T> implements TADPilhaDuplamenteEncadeada{


    private No<T> header;
    private No<T> trailer;
    private int tamanho;

    public PilhaDuplamenteEncadeada() {
        header = new No<T>(null, null, null);
        trailer = new No<T>(null, header, null);
        header.setProximo(trailer);
        tamanho = 0;
    }

    @Override
    public void insereFinal(Object valor) {

        No<T> novoNo = new No<T>((T) valor, null, null);

        trailer.getAnterior().setProximo(novoNo);
        novoNo.setAnterior(trailer.getAnterior());

        novoNo.setProximo(trailer);
        trailer.setAnterior(novoNo);

        tamanho++;

    }

    @Override
    public Object removeFinal() {

        No<T> noRemovido = trailer.getAnterior();

        trailer.setAnterior(noRemovido.getAnterior());
        noRemovido.getAnterior().setProximo(trailer);

        noRemovido.setProximo(null);
        noRemovido.setAnterior(null);

        tamanho--;

        return noRemovido.getValor();
    }

    @Override
    public boolean filaVazia() {

        if(tamanho == 0){
            return true;
        }
        return false;
    }

    @Override
    public void imprimeFila() {
        if (filaVazia()) {
            System.out.println("Fila vazia, nao ha elementos para remocao");
            return;
        }

        No<T> auxiliar = header;
        while(auxiliar != null) {
            System.out.print(" <=> " + auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println();

    }
}
