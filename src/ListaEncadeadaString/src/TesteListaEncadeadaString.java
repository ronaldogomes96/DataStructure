public class TesteListaEncadeadaString {
    public static void main(String[] args) {
        TADListaEncadeadaString<String> listaEncadeadaString = new ListaEncadeadaString<String>();

        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.insereInicio("brasil");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.insereInicio("eua");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.insereInicio("brasil");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.insereFinal("chile");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.removeNoComString("c");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.insereFinal("mexico");
        listaEncadeadaString.imprimeLista();

        listaEncadeadaString.removeNoComString("a");
        listaEncadeadaString.imprimeLista();
    }
}
