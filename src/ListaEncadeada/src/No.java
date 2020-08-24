public class No<T> {

    private T valor;
    private No proximo;
    private No anterior;

    public No(T valor, No proximo, No anterior){
        this.valor = valor;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public T getValor(){
        return valor;
    }

    public void setValor(T valor){
        this.valor = valor;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    public No getAnterior(){
        return anterior;
    }

    public void setAnterior(No anterior){
        this.anterior = anterior;
    }
}
