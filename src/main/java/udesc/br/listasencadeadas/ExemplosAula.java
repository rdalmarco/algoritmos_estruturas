package udesc.br.listasencadeadas;

public class ExemplosAula {

    static Nodo inicio = null;

    public static void main(String[] args) {

        insere(1);
        insere(2);
        insere(3);
        insere(4);

        imprime();
    }

    public static void imprime() {

        Nodo aux = inicio;

        while (aux != null) {
            System.out.println(aux.chave);
            aux = aux.prox;
        }

    }

    public static void insere(int chave) {
        Nodo nd = new Nodo();
        nd.chave = chave;

        if (inicio == null) {
            inicio = nd;
        } else {
            Nodo aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = nd;
        }

    }

    public static int remove() {
        int chave = inicio.chave;
        Nodo aux = inicio.prox;
        inicio.prox = null;
        inicio = aux;
        return chave;
    }
}
