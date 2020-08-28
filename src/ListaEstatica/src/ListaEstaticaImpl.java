public class ListaEstaticaImpl<E> implements TADListaEstatica {

    private E [] lista;
    private int posicao;

    public ListaEstaticaImpl(int tamanho) {
        lista = (E[]) new Object[tamanho];
        posicao = -1;
    }

    @Override
    public Object set(int pos, Object o) {

        if (listaVazia() || listaCheia()) {
            System.out.println("Lista sem espaco");
            return null;
        }

        if(pos>=lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao inserido");
            return null;
        }

        for (int i = posicao; i >= pos - 1; i--) {
            lista[i + 1] = lista[i];
        }

        lista[pos] = (E)o;
        ++posicao;

        return (E)o;
    }

    @Override
    public void addPrimeiro(Object o) {
        if (listaCheia()) {
            System.out.println("Lista sem espaco");
            return;
        }

        for (int i = posicao; i >= 0; i--) {
            lista[i + 1] = lista[i];
        }

        lista[0] = (E)o;
        ++posicao;

    }

    @Override
    public void addUltimo(Object o) {

        if (listaVazia() || listaCheia()) {
            System.out.println("Lista sem espaco");
            return;
        }

        lista[posicao+1] = (E)o;
        ++posicao;
    }

    @Override
    public void addAntes(int pos, Object o) {
        if (listaVazia() || listaCheia()) {
            System.out.println("Lista sem espaco");
            return;
        }

        if(pos>=lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao inserido");
            return;
        }

        for (int i = posicao; i >= pos - 1; i--) {
            lista[i + 1] = lista[i];
        }

        lista[pos] = (E)o;
        ++posicao;
    }

    @Override
    public void addApos(int pos, Object o) {
        if (listaVazia() || listaCheia()) {
            System.out.println("Lista sem espaco");
            return;
        }

        if(pos>=lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao inserido");
            return;
        }

        for (int i = posicao; i >= pos ; i--) {
            lista[i + 1] = lista[i];
        }

        lista[pos] = (E)o;
        ++posicao;
    }

    @Override
    public void remove(Object o) {

        if (listaVazia() || listaCheia()) {
            System.out.println("Lista sem espaco");
            return;
        }

        int newPosicao = 0;

        for (int i = 0; i <= posicao; i++) {
            if(lista[i] == (E)o) {
                lista[i] = null;
                newPosicao = i;
                break;
            }
        }

        for (int i = newPosicao; i <= posicao; i++) {
            lista[i] = lista[i+1];
        }
    }

    @Override
    public void remove(int pos) {
        if (listaVazia()) {
            System.out.println("Lista Vazia. Não há elemento para remoção.");
            return;
        }

        if(posicao >= lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao removido");
            return;
        }

        for (int i = pos; i < posicao; i++) {
            lista[i] = lista[i + 1];
        }

        lista[posicao--] = null;

    }

    @Override
    public Object fisrt() {
        return lista[0];
    }

    @Override
    public Object last() {
        return lista[posicao];
    }

    @Override
    public void imprimeLista() {
        if (listaVazia()) {
            System.out.println("Lista Vazia. Não há elementos para impressão");
            return;
        }

        for (int i = 0; i <= posicao; i++) {
            System.out.print(lista[i] + "\t");
        }
        System.out.println();
    }

    @Override
    public boolean listaCheia() {
        if (posicao == lista.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean listaVazia() {
        return posicao == -1 ? true : false;
    }
}
