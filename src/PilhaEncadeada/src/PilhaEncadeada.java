public class PilhaEncadeada<T> implements TADPilhaEncadeada {

    private No<T> cabeca;

    @Override
    public void insereInicio(Object valor) {

        No<T> novoNo = new No<T>((T) valor, null);

        if(pilhaVazia()) {
            cabeca = novoNo;
            return;
        }

        novoNo.setProximo(cabeca);
        cabeca = novoNo;
    }

    @Override
    public Object removeInicio() {

        if (pilhaVazia()) {
            System.out.println("Pilha vazia, nao há elementos para remocao");
            return null;
        }

        No<T> NoRemovido = cabeca;
        cabeca = cabeca.getProximo();
        NoRemovido.setProximo(null);

        return NoRemovido.getValor();
    }

    @Override
    public boolean pilhaVazia() {

        if( cabeca == null ) {
            return true;
        }
        return false;
    }

    @Override
    public void imprimirPilha() {

        if (pilhaVazia()) {
            System.out.println("Pilha vazia, nao há elementos para impressao");
        }

        No<T> auxiliar = cabeca;
        while (auxiliar != null) {
            System.out.print(" => " + auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("");
    }
}
