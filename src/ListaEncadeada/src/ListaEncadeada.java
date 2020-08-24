public class ListaEncadeada<T> implements TADListaEncadeada {

    private No<T> cabeca;


    @Override
    public void AdicionaInicio(Object valor) {
        No<T> novoNo = new No<T>((T) valor, null, null);

        if(ListaVazia()) {
            cabeca = novoNo;
            return;
        }

        cabeca.setAnterior(novoNo);
        novoNo.setProximo(cabeca);
        cabeca = novoNo;
    }

    @Override
    public void AdicionaFim(Object valor) {
        No<T> novoNo = new No<T>((T) valor, null, null);

        if(ListaVazia()) {
            cabeca = novoNo;
            return;
        }

        No<T> auxiliar = cabeca;
        while(auxiliar.getProximo() != null){
            auxiliar = auxiliar.getProximo();
        }
        auxiliar.setProximo(novoNo);
        novoNo.setAnterior(auxiliar);

    }

    @Override
    public void AdicionaMeio(Object valor, Integer posicao) {

        if(ListaVazia() || posicao < 1){
            System.out.println("Lista vazia, nao ha elementos para remocao");
        }

        No<T> novoNo = new No<T>((T) valor, null, null);
        No<T> noAnterior = cabeca;

        for(int i = 0; i < posicao - 1; i++){
            if(noAnterior.getValor() == null){
                System.out.println("Lista vazia, nao ha elementos para remocao");
                return;
            }
            noAnterior = noAnterior.getProximo();
        }

        No<T> noPosterior = noAnterior.getProximo();
        noAnterior.setProximo(novoNo);
        novoNo.setProximo(noPosterior);
        novoNo.setAnterior(noAnterior);
        noPosterior.setAnterior(novoNo);
    }

    @Override
    public Object RemoveFim() {

        if(ListaVazia()) {
            System.out.println("Lista vazia, nao ha elementos para remocao");
        }

        No<T> auxiliar = cabeca;
        while(auxiliar.getProximo() != null){
            auxiliar = auxiliar.getProximo();
        }
        No<T> ultimo = auxiliar.getAnterior();
        ultimo.setProximo(null);
        auxiliar.setProximo(null);
        auxiliar.setAnterior(null);
        return auxiliar.getValor();
    }

    @Override
    public Object RemoveInicio() {

        if(ListaVazia()) {
            System.out.println("Lista vazia, nao ha elementos para remocao");
        }

        No<T> auxiliar = cabeca;
        cabeca = cabeca.getProximo();
        auxiliar.setProximo(null);
        cabeca.setAnterior(null);
        return auxiliar.getValor();
    }

    @Override
    public Object RemovePosicao(Integer posicao) {

        if(ListaVazia() || posicao < 1){
            System.out.println("Lista vazia, nao ha elementos para remocao");
        }

        No<T> noRemovido;
        No<T> noAnterior = cabeca;


        for(int i = 0; i < posicao-1; i++) {
            if (noAnterior.getValor() == null) {
                System.out.println("Lista vazia, nao ha elementos para remocao");
                return null;
            }
            noAnterior = noAnterior.getProximo();
        }

        No<T> noPosterior = noAnterior.getProximo();

        if(posicao == 0 ){
            noRemovido = cabeca;
            cabeca = noRemovido.getProximo();
            cabeca.setAnterior(null);
            return noRemovido.getValor();
        }
        noRemovido = noPosterior;
        noAnterior.setProximo(noPosterior.getProximo());
        noRemovido.setAnterior(null);
        noRemovido.setProximo(null);
        return noRemovido.getValor();
    }

    @Override
    public boolean ListaVazia() {
        if(cabeca == null) {
            return true;
        }
        return false;
    }

    @Override
    public void ImprimirFila() {
        if (ListaVazia()) {
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
