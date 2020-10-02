public class TesteArvoreBinaria {

    public static void main(String[] args) {

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();

        arvore.insereRaiz(30);

        arvore.insereEsquerda(20, arvore.getRaiz());
        arvore.insereDireita(40, arvore.getRaiz());

        arvore.insereEsquerda(15, arvore.getRaiz().getEsq());
        arvore.insereDireita(25, arvore.getRaiz().getEsq());

        arvore.insereEsquerda(33, arvore.getRaiz().getDir());
        arvore.insereDireita(44, arvore.getRaiz().getDir());

        arvore.imprimePrefixado(arvore.getRaiz());

        arvore.imprimeInterfixado(arvore.getRaiz());

        arvore.imprimePosfixado(arvore.getRaiz());
    }
}
