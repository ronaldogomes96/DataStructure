public class FilaEncadeada<T> implements TADFilaEncadeada{

    private No<T> cabeca;
    private int tamanho;

    @Override
    public void insereFinal(Object valor) {
        No<T> novoNo = new No<T>((T) valor, null);

        if (filaVazia()){
            cabeca = novoNo;
        }
        else {
            No<T> auxiliar = cabeca;
            while(auxiliar.getProximo() != null){
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoNo);
        }
        tamanho++;
    }

    @Override
    public Object removeInicio() {

        if (filaVazia()){
            System.out.println("Fila vazia, nao ha elementos para remocao");
            return null;
        }

        No<T> noRemovido = cabeca;
        cabeca = cabeca.getProximo();
        noRemovido.setProximo(null);
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

        No<T> auxiliar = cabeca;
        while(auxiliar != null) {
            System.out.print(" => " + auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println();
    }
}
