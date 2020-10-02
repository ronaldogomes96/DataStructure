public class TesteArvoreBinariaBusca {
    public static void main(String[] args) {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insereNo(10, arvore.getRaiz());
        arvore.insereNo(20, arvore.getRaiz());
        arvore.insereNo(30, arvore.getRaiz());
        arvore.insereNo(25, arvore.getRaiz());

        arvore.removeNo(20, arvore.getRaiz());

        arvore.imprimePrefixado(arvore.getRaiz());
        arvore.alturaNo(arvore.getRaiz());
        arvore.profundidadeRecursiva(arvore.getRaiz());


    }
}
