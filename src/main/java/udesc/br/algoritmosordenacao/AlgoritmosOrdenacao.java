package udesc.br.algoritmosordenacao;

import java.util.Random;

public class AlgoritmosOrdenacao {

    public static void main(String[] args) {
        int valores[] = new int[8];

        Random gerador = new Random();

        for (int x = 0; x < valores.length; x++) {
            valores[x] = gerador.nextInt(50);
        }

        for (int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + ";");

        }
        System.out.println("");
        System.out.println("Ordenado Bolha:");
        bolha(valores);
        System.out.println("");
        System.out.println("Ordenado Quick:");
        valores[0] = 1;
        valores[1] = 6;
        valores[2] = 2;
        valores[3] = 4;
        valores[4] = 8;
        valores[5] = 3;
        valores[6] = 7;
        valores[7] = 5;
        QuickSort(valores);

    }

    public static void bolha(int[] valores) {
        for (int x = 0; x < valores.length - 1; x++) {
            for (int i = 0; i < valores.length - 1; i++) {
                if (valores[i] > valores[i + 1]) {
                    int aux = valores[i];
                    valores[i] = valores[i + 1];
                    valores[i + 1] = aux;
                }
            }
        }
        for (int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + ";");
        }

    }

    public static void QuickSort(int[] valores) {

        int pivo = valores[valores.length - 1];
        int guardaVal = 0;
        int lugarFila = 0;

        for (int x = 0; x < valores.length; x++) {
            if (valores[x] < pivo) {
                guardaVal = valores[lugarFila];
                valores[lugarFila] = valores[x];
                valores[x] = guardaVal;
                lugarFila++;
            }

        }

        int guardaVal2 = 0;
        guardaVal2 = valores[lugarFila];
        valores[lugarFila] = pivo;
        valores[valores.length - 1] = guardaVal2;

        for (int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + ";");
        }
    }

}
