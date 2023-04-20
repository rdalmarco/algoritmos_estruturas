package udesc.br.recursividade.lista01;

public class exercicio05 {


    public static void main(String[] args) {
        int decimal = 25;
        String binario = converteBinario(decimal);
        System.out.println(binario);
    }

    public static String converteBinario(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return converteBinario(decimal / 2) + decimal % 2;
        }
    }
}
