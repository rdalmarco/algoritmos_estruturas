package udesc.br.algoritmoeuclides;

import java.util.Scanner;

public class Exemplo {

    static No inicio = null;
    static int mdc = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int divisor = 357;

        int dividendo = 17154;

        //insereLista(divisor, dividendo);
        //imprime();
        insereListaOtimizado(divisor, dividendo);
        imprimeOtimizado();

    }

    public static void insereLista(int divisor, int dividendo) {
        int dividendoAux = 0;
        int divisorAux = divisor;
        int resto = 0;
        int mdc = 0;
        while (divisorAux > 0) {
            if (inicio == null) {
                inicio = new No();
                resto = resto(dividendo, divisor);
                inicio.chave = "|" + String.valueOf(dividendo) + ';' + String.valueOf(divisor) + "|";
                dividendo = divisor;
                divisorAux = resto;
            } else {
                No novo = new No();
                int restoAux = resto(dividendo, divisorAux);
                novo.chave = "|" + String.valueOf(dividendo) + ';' + String.valueOf(divisorAux) + "|";
                dividendo = divisorAux;
                mdc = divisorAux;
                divisorAux = restoAux;
                No aux = inicio;
                while (aux.prox != null) {
                    aux = aux.prox;
                }
                aux.prox = novo;
                novo.ant = aux;
            }
        }

        System.out.println("MDC: " + mdc);
    }

    public static void insereListaOtimizado(int divisor, int dividendo) {
        while (divisor > 0) {
            if (inicio == null) {
                inicio = new No();
                inicio.dividendo = dividendo;
                inicio.divisor = divisor;
            } else {
                No novo = new No();
                No aux = inicio;
                while (aux.prox != null) {
                    aux = aux.prox;
                }
                aux.prox = novo;
                novo.ant = aux;
                novo.dividendo = novo.ant.divisor;
                novo.divisor = resto(novo.ant.dividendo, novo.ant.divisor);
                mdc = novo.divisor;
                divisor = resto(novo.ant.divisor, (resto(novo.ant.dividendo, novo.ant.divisor)));
            }
        }

    }

    public static int resto(int dividendo, int divisor) {
        return dividendo % divisor;
    }

    public static void imprime() {

        No aux = inicio;

        while (aux != null) {
            System.out.println(aux.chave);
            aux = aux.prox;
        }

    }

    public static void imprimeOtimizado() {

        No aux = inicio;

        while (aux != null) {
            System.out.println(aux.dividendo + "|" + aux.divisor);
            aux = aux.prox;
        }

        System.out.println("MDC: " + mdc);

    }
}
