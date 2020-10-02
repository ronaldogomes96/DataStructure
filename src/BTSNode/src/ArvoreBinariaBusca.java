public class ArvoreBinariaBusca {

    private BTSNode raiz;

    public void insereNo(Integer valor, BTSNode noBase) {

        if (raiz == null) {
            raiz = new BTSNode(valor, null, null, null);
            return;
        }

        //Tenta inserir a direita
        if (valor > noBase.getValor()) {
            if (noBase.getDir() == null){
                BTSNode novoNo = new BTSNode(valor, noBase, null, null);
                noBase.setDir(novoNo);
            } else {
                insereNo(valor, noBase.getDir());
            }
        }
        //Tenta inserir na esquerda
        else if (valor < noBase.getValor()) {
            if (noBase.getEsq() == null){
                BTSNode novoNo = new BTSNode(valor, noBase, null, null);
                noBase.setEsq(novoNo);
            } else {
                insereNo(valor, noBase.getEsq());
            }
        }
        else if (valor == noBase.getValor()) {
            System.out.println("Valor ja inserido na arvore");
        }
    }

    public void imprimePrefixado(BTSNode noBase) {
        if (noBase != null) {
            System.out.print(noBase.getValor() + "\t");
            imprimePrefixado(noBase.getEsq());
            imprimePrefixado(noBase.getDir());
        }
    }

    public void imprimeInterfixado(BTSNode noBase) {
        if (noBase != null) {
            imprimeInterfixado(noBase.getEsq());
            System.out.print(noBase.getValor() + "\t");
            imprimeInterfixado(noBase.getDir());
        }
    }

    public void imprimePosfixado(BTSNode noBase) {
        if (noBase != null) {
            imprimePosfixado(noBase.getEsq());
            imprimePosfixado(noBase.getDir());
            System.out.print(noBase.getValor() + "\t");
        }
    }

    public int profundidadeRecursiva(BTSNode noBase) {
        if (noBase == null || noBase.equals(raiz)){
            return 0;
        } else {
            return 1 + profundidadeRecursiva(noBase.getPai());
        }
    }

    public int alturaNo(BTSNode noBase) {
        if (noBase == null || isFolha(noBase)) {
            return 0;
        }
        else {
            return 1 + Math.max(alturaNo(noBase.getDir()), alturaNo(noBase.getEsq()));
        }
    }

    public boolean isFolha(BTSNode no) {
        if(no.getDir() == null && no.getEsq() == null) {
            return true;
        }
        return false;
    }

    public BTSNode pesquisaNo(Integer valor, BTSNode noBase) {
        if (noBase == null) {
            return null;
        }
        if (valor == noBase.getValor()) {
            return noBase;
        }
        if (valor < noBase.getValor()) {
            pesquisaNo(valor, noBase.getEsq());
        } else {
            return pesquisaNo(valor, noBase.getDir());
        }
        return null;
    }

    public BTSNode getRaiz() {
        return raiz;
    }

    public void removeNo(Integer valor, BTSNode noBase) {

        if (noBase == null) {
            System.out.println("Valor nao existe");
            return;
        }

        if (noBase.getValor() == valor) {
            if(isFolha(noBase)){
                noBase = null;
                return;
            } else {

                BTSNode auxiliar;
                if(noBase.getDir() != null){
                    auxiliar = noBase.getDir();
                    while (auxiliar.getEsq() != null){
                        auxiliar = auxiliar.getEsq();
                    }
                }
                else {
                    auxiliar = noBase.getEsq();
                    while (auxiliar.getDir() != null){
                        auxiliar = auxiliar.getDir();
                    }
                }
                noBase.setValor(auxiliar.getValor());
                removeNo(auxiliar.getValor(), auxiliar);
                return;
            }
        }else if(valor < noBase.getValor()){
            removeNo(valor, noBase.getEsq());
        }else{
            removeNo(valor, noBase.getDir());
        }
    }
}
