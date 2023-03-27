package udesc.br.listasencadeadas.listasduplamenteencadeadas;

public class Exemplo {

    static No inicio = null;

    public static void main(String[] args) {

    }

    public static void insereInicio(int chave) {
        if (inicio == null) {
            inicio = new No();
            inicio.chave = chave;
        } else {
            No novo = new No();
            novo.chave = chave;
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
        }
    }

    public static void insereFinal(int chave) {
        if (inicio == null) {
            inicio = new No();
            inicio.chave = chave;
        } else {
            No novo = new No();
            novo.chave = chave;
            No aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = novo;
            novo.ant = aux;
        }
    }

    public static void insereMeio(int chave) {
        if (inicio == null) {
            inicio = new No();
            inicio.chave = chave;
        } else {
            No aux = inicio;
            while (aux.chave < chave && aux.prox != null) {
                aux = aux.prox;
            }
            if (aux.chave > chave && aux.ant != null) {
                No novo = new No();
                novo.chave = chave;
                No ant = aux.ant;
                novo.prox = aux;
                novo.ant = ant;
                ant.prox = novo;
                aux.ant = novo;
            } else if (aux.chave < chave && aux.prox == null) {
                insereFinal(chave);
            } else if (aux.chave > chave && aux.ant == null) {
                insereInicio(chave);
            }
        }
    }
}
