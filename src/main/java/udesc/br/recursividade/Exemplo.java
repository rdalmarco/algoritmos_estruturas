package udesc.br.recursividade;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor inteiro");
        int valor = s.nextInt();
        //imprime(valor);
        soma(valor);

    }

    public static void imprime(int valor) {
        if (valor > 1) {
            imprime(valor - 1);
        }
        System.out.println(valor);

    }

    public static int soma(int valor) {
        if (valor > 0) {
            valor += soma(valor - 1);
        }
        System.out.println(valor);
        return valor;
    }
}
