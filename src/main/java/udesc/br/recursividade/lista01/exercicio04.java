package udesc.br.recursividade.lista01;

import java.util.ArrayList;
import java.util.List;

public class exercicio04 {

    static int resto = 1;

    public static void main(String[] args) {

        System.out.println(calculaMDC(52, 24));

    }

    public static int calculaMDC(int valor1, int valor2) {
        if (resto > 0) {
            resto = valor1 % valor2;
            return (calculaMDC(valor2, (valor1 % valor2)));

        } else {
            return valor1;
        }
    }

}
