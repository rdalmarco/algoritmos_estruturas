package udesc.br.recursividade.lista01;

public class exercicio03 {
    
    static int controle = 1;

    public static void main(String[] args) {

        System.out.println(calculaPotencia(5, 7));
    }

    public static double calculaPotencia(int valor, int potencia) {
        if (controle < potencia) {
            controle ++;
             return valor * calculaPotencia(valor, potencia);
        } else {
            return valor;
        }

    }
}
