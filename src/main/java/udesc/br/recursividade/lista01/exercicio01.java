package udesc.br.recursividade.lista01;

public class exercicio01 {

    public static void main(String[] args) {
        
        System.out.println(calculaFatorial(50));

    }

    public static double calculaFatorial(int valor) {
        if ((valor == 1) || (valor == 0)) {
            return 1;
        } else {
            return valor * (calculaFatorial((valor - 1)));

        }
    }

}
