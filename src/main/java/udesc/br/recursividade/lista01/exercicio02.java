package udesc.br.recursividade.lista01;

public class exercicio02 {

    public static void main(String[] args) {
        
        System.out.println(calculaImpares(9));

    }

    public static int calculaImpares(int valor) {
        if ((valor > 1)) {
            return valor + (calculaImpares(valor - 2));
        }
        else {
            return valor;
        }
    }

}
