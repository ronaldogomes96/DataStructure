public class ArvoreBinaria<T> {

    private No<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public No<T> insereRaiz(T valor) {

        if(raiz != null) {
            System.out.println("No raiz ja existe, elemento nao inserido");
            return null;
        }

        raiz = new No<T>(valor, null, null, null);
        return raiz;
    }

    public No<T> insereEsquerda(T valor, No<T> noBase) {

        if(noBase == null) {
            System.out.println("No raiz ja existe, elemento nao inserido");
            return null;
        }

        if(noBase.getEsq() != null) {
            System.out.println("No esquerda ja existe, elemento nao inserido");
            return null;
        }

        No<T> novoNo = new No<T>(valor, noBase, null, null);
        noBase.setEsq(novoNo);

        return novoNo;
    }

    public No<T> insereDireita(T valor, No<T> noBase) {

        if(noBase == null) {
            System.out.println("No raiz ja existe, elemento nao inserido");
            return null;
        }

        if(noBase.getDir() != null) {
            System.out.println("No direita ja existe, elemento nao inserido");
            return null;
        }

        No<T> novoNo = new No<T>(valor, noBase, null, null);
        noBase.setDir(novoNo);

        return novoNo;
    }

    public void imprimePrefixado(No<T> noBase) {
        if(noBase != null) {
            System.out.print(noBase.getValor() + "\t");
            imprimePrefixado(noBase.getEsq());
            imprimePrefixado(noBase.getDir());
        }
    }

    public void imprimeInterfixado(No<T> noBase) {
        if(noBase != null) {
            imprimeInterfixado(noBase.getEsq());
            System.out.print(noBase.getValor() + "\t");
            imprimeInterfixado(noBase.getDir());
        }
    }

    public void imprimePosfixado(No<T> noBase) {
        if(noBase != null) {
            imprimePosfixado(noBase.getEsq());
            imprimePosfixado(noBase.getDir());
            System.out.print(noBase.getValor() + "\t");
        }
    }

    public No<T> getRaiz() {
        return raiz;
    }
}
