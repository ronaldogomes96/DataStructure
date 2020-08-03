public class ListaImpl implements Lista {
    private Integer[] lista;
    private int posicao;

    public ListaImpl(int tamanho) {
        lista = new Integer[tamanho];
        posicao = -1;
    }


    @Override
    public void AdicionaInicio(Integer valor) {
        if (ListaCheia()) {
            System.out.println("Lista Cheia. Elemento não inserido.");
            return;
        }

        for (int i = posicao; i >= 0; i--) {
            lista[i + 1] = lista[i];
        }

        lista[0] = valor;
        ++posicao;
    }


    @Override
    public void AdicionaFim(Integer valor) {
        if (ListaCheia()) {
            System.out.println("Lista Cheia. Elemento não inserido.");
            return;
        }

        lista[++posicao] = valor;
    }

    @Override
    public void AdicionaMeio(Integer valor, Integer posi) {
        if (ListaCheia()) {
            System.out.println("Lista Cheia. Elemento não inserido.");
            return;
        }

        if(posi>=lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao inserido");
            return;
        }

        for (int i = posicao; i >= posi; i--) {
            lista[i + 1] = lista[i];
        }

        lista[posi] = valor;
        ++posicao;
    }

    @Override
    public Integer RemoveInicio() {

        if (ListaVazia()) {
            System.out.println("Lista Vazia. Não há elemento para remoção.");
            return null;
        }

        int elementoRemovido = lista[0];

        for (int i = 0; i < posicao; i++) {
            lista[i] = lista[i + 1];
        }

        lista[posicao--] = null;


        return elementoRemovido;
    }

    @Override
    public Integer RemoveFim() {
        if (ListaVazia()) {
            System.out.println("Lista Vazia. Não há elemento para remoção.");
            return null;
        }

        lista[posicao--] = null;

        return null;
    }

    @Override
    public Integer RemovePosicao(int posi) {
        if (ListaVazia()) {
            System.out.println("Lista Vazia. Não há elemento para remoção.");
            return null;
        }

        if(posi>=lista.length-1) {
            System.out.println("Index fora da lista. Elemento nao removido");
            return null;
        }


        int elementoRemovido = lista[posi];

        for (int i = posi; i < posicao; i++) {
            lista[i] = lista[i + 1];
        }

        lista[posicao--] = null;


        return elementoRemovido;

    }

    @Override
    public boolean ListaCheia() {
        if (posicao == lista.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean ListaVazia() {
        return posicao == -1 ? true : false;
    }

    @Override
    public void imprimeLista() {
        if (ListaVazia()) {
            System.out.println("Lista Vazia. Não há elementos para impressão");
            return;
        }

        for (int i = 0; i <= posicao; i++) {
            System.out.print(lista[i] + "\t");
        }
        System.out.println();
    }
}
