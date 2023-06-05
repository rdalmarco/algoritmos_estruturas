package udesc.br.grafos;

import udesc.br.grafos.Vertice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grafo {

    private class No {

        public Vertice vertice = null;
        public No ant = null;
        public No prox = null;
    }

    private int quantVertices = 0;

    private No G = null;

    public Grafo() {
    }

    public Grafo(int chave) {
        addVertice(chave);
    }

    public Vertice getVertice(int chave) {
        if (G != null) {
            No aux = G;

            while (aux != null) {
                if (aux.vertice.chave == chave) {
                    return aux.vertice;
                }
                aux = aux.prox;
            }
        }
        return null;
    }

    public Vertice addVertice(int chave) {
        try {
            Vertice v = new Vertice(chave);
            v.chave = chave;
            No novo = new No();
            novo.vertice = v;

            if (G == null) {
                G = novo;
            } else {
                No aux = G;

                while (aux.prox != null) {
                    aux = aux.prox;
                }

                aux.prox = novo;
                novo.ant = aux;
            }
            quantVertices++;
            return v;
        } catch (Exception e) {
            return null;
        }

    }

    public boolean removeVertice(int chave) {
        if (G != null) {
            if (G.prox == null) {
                removeAdjacencias(G.vertice);
                G = null;
            } else {
                No aux = G;
                while (aux.prox != null) {
                    if (aux.vertice.chave == chave) {
                        removeAdjacencias(aux.vertice);
                        if (aux.ant == null) {
                            G = G.prox;
                            G.ant = null;
                        } else if (aux.prox == null) {
                            No ant = aux.ant;
                            ant.prox = null;
                        } else {
                            No ant = aux.ant;
                            aux.prox.ant = ant;
                            ant.prox = aux.prox;
                        }

                        aux = null;
                        quantVertices--;
                        return true;
                    }
                    aux = aux.prox;
                }
            }
        }
        return false;
    }

    private boolean removeAdjacencias(Vertice v) {
        try {
            while (v.possuiAdjacencias()) {
                v.removeAdjacencia(0);
            }
            quantVertices = 0;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void reset() {
        if (G != null) {
            No aux = G;

            while (aux != null) {
                aux.vertice.visitado = false;
                aux = aux.prox;
            }
        }
    }

    public void print() {
        if (G != null) {
            No aux = G;

            while (aux != null) {
                System.out.print(aux.vertice.print());
                System.out.println("");
                aux = aux.prox;
            }
        }
    }

    /*
	 * IMPLEMENT AÇÕES BÁSICAS
     */
    public void caminhaLargura() {//throws CloneNotSupportedException {
        List<Vertice> fila = new ArrayList();
        if (G != null) {
            G.vertice.visitado = true;
            System.out.println(G.vertice.chave);
        }
        fila.add(G.vertice);
        while (!fila.isEmpty()) {
            Vertice w = (Vertice) fila.get(0);
            List<Aresta> adjacencias = w.getAdjacencias();
            for (Aresta aresta : adjacencias) {
                 w = aresta.destino;
                if (w.visitado == false) {
                    w.visitado = true;
                    System.out.println(w.chave);
                    fila.add(w);
                }
            }
            fila.remove(0);
        }

    }

    public void caminhaProfundidade() {
    }

    private int[][] geraMatrizCustos() {
        return null;
    }

    public void imprimeMenorCaminho(int origem, int destino, int[] caminhoMaisCurto) {
    }

    public void menorCaminho(int origem, int destino) {

    }

}
