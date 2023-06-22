package udesc.br.grafos;

import udesc.br.grafos.Vertice;

public class Principal {

    public static void criaGrafo1(Grafo grafo) {
        // Grafo original 
        Vertice v;
        //System.out.println(4 % 11);
        //System.out.println(17 % 11);
        //System.out.println(13 % 11);
        //System.out.println(35 % 11);
        //System.out.println(25 % 11);
        //System.out.println(11 % 11);
        //System.out.println(2 % 11);
        //System.out.println(10 % 11);
        //System.out.println(32 % 11);

        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addVertice(5);
        grafo.addVertice(6);
        grafo.addVertice(7);
        grafo.addVertice(8);

        v = grafo.getVertice(1);
        v.addAdjacencia(grafo.getVertice(2), 20);
        v.addAdjacencia(grafo.getVertice(4), 80);
        v.addAdjacencia(grafo.getVertice(7), 90);

        v = grafo.getVertice(2);
        v.addAdjacencia(grafo.getVertice(6), -10);

        v = grafo.getVertice(3);
        v.addAdjacencia(grafo.getVertice(4), 10);
        v.addAdjacencia(grafo.getVertice(6), 50);
        v.addAdjacencia(grafo.getVertice(8), 20);
        v.addAdjacencia(v, 5);

        v = grafo.getVertice(4);
        v.addAdjacencia(grafo.getVertice(7), 20);

        v = grafo.getVertice(5);
        v.addAdjacencia(grafo.getVertice(2), 50);
        v.addAdjacencia(grafo.getVertice(7), 30);

        v = grafo.getVertice(6);
        v.addAdjacencia(grafo.getVertice(3), 10);
        v.addAdjacencia(grafo.getVertice(4), 40);

        v = grafo.getVertice(7);
        v.addAdjacencia(grafo.getVertice(1), 20);

    }

    public static void criaGrafo2(Grafo grafo) {
        // Grafo com dois caminhos de mesmo custo
        Vertice v;
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addVertice(5);
        grafo.addVertice(6);
        grafo.addVertice(7);
        grafo.addVertice(8);
        grafo.addVertice(9);

        v = grafo.getVertice(1);
        v.addAdjacencia(grafo.getVertice(2), 20);
        v.addAdjacencia(grafo.getVertice(4), 80);
        v.addAdjacencia(grafo.getVertice(9), 25);

        v = grafo.getVertice(2);
        v.addAdjacencia(grafo.getVertice(6), -10);

        v = grafo.getVertice(3);
        v.addAdjacencia(grafo.getVertice(4), 10);
        v.addAdjacencia(grafo.getVertice(6), 50);
        v.addAdjacencia(grafo.getVertice(8), 20);
        v.addAdjacencia(v, 5);

        v = grafo.getVertice(4);
        v.addAdjacencia(grafo.getVertice(7), 20);

        v = grafo.getVertice(5);
        v.addAdjacencia(grafo.getVertice(2), 50);
        v.addAdjacencia(grafo.getVertice(7), 30);

        v = grafo.getVertice(6);
        v.addAdjacencia(grafo.getVertice(3), 10);
        v.addAdjacencia(grafo.getVertice(4), 40);

        v = grafo.getVertice(7);
        v.addAdjacencia(grafo.getVertice(1), 20);

        v = grafo.getVertice(9);
        v.addAdjacencia(grafo.getVertice(7), 25);
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        //criaGrafo1(grafo);
        criaGrafo2(grafo);

        //grafo.print();
       // System.out.println("-------------------------------------");

        //try{
        //System.out.println("---------LARGURA-----------------------");
        //grafo.caminhaLargura();
        //grafo.reset();
        //System.out.println("---------PROFUNDIDADE-----------------------");
        //grafo.caminhaProfundidade();
        System.out.println("---------MENOR CAMINHO 1-7------------------");
        grafo.menorCaminho(1, 7);
        //}
        //catch (Exception e)
        //{
        //	System.out.println(e.getMessage() + "         buxa");
        //}

        System.out.println("-------------------------------------");

    }

}
