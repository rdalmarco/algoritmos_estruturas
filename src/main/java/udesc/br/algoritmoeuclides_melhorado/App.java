package udesc.br.algoritmoeuclides_melhorado;

import java.util.Scanner;

public class App {

    static No inicio = null;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja continuar ?");
            continuar = s.next().equals("S");
            System.out.println("Informe o dividendo");
            int dividendo = s.nextInt();
            System.out.println("Informe o divisor");
            int divisor = s.nextInt();
            insereLista(dividendo, divisor);
        }

        No aux = inicio;
        while (aux.prox != null) {
            aux = aux.prox;
        }

        aux.de.imprime(aux.de.start());

    }

    public static void insereLista(int dividendo, int divisor) {
        if (inicio == null) {
            No inicio = new No();
            inicio.de = new DivisaoEuclidiana(dividendo, divisor);
        } else {
            No novo = new No();
            novo.de = new DivisaoEuclidiana(dividendo, divisor);
            No aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = novo;
            novo.ant = aux;

        }
    }
}
