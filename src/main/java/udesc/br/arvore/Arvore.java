package udesc.br.arvore;

public class Arvore {

    private No raiz = null;

    public Arvore() {
    }

    /**
     * ****************************************
     * OPERA��ES BASICAS ***************************************
     */
    public No getRaiz() {
        return this.raiz;
    }

    public void insere(No raiz, int chave, String filename, int size) {
        if (this.raiz == null) {
            No novo = new No(chave, filename, size);
            this.raiz = novo;
        } else {
            if (chave > raiz.getValor()) {
                if (raiz.getDireita() != null) {
                    insere(raiz.getDireita(), chave, filename, size);
                } else {
                    No novo = new No(chave, filename, size);
                    novo.pai = raiz;
                    novo.esq = null;
                    novo.dir = null;
                    raiz.dir = novo;
                }
            } else {
                if (raiz.getEsquerda() != null) {
                    insere(raiz.getEsquerda(), chave, filename, size);
                } else {
                    No novo = new No(chave, filename, size);
                    novo.pai = raiz;
                    novo.esq = null;
                    novo.dir = null;
                    raiz.esq = novo;
                }
            }
        }
    }

    public void caminhaPreFixado(No raiz) {
        if (this.raiz == null) {
        } else {
            System.out.println(raiz.getValor());
            if (raiz.getEsquerda() != null) {
                caminhaPreFixado(raiz.getEsquerda());
            } else {
                System.out.println(raiz.getValor());
                if (raiz.getDireita() != null) {
                    caminhaPreFixado(raiz.getDireita());
                } else {
                    System.out.println(raiz.getValor());
                }
            }
        }
    }

public void caminhaPosFixado(No raiz) {
    }

    public void caminhaCentral(No raiz) {
    }

    public boolean remove(No pai, No corrente, int valor) {
        return false;
    }

    /**
     * ****************************************
     * OUTRAS OPERA��ES ***************************************
     */
    // 1. Retorna true se a �rvore n�o possui nenhum n�
    public boolean vazio() {
        return raiz == null;
    }

    // 2. Localiza um n� da �rvore. Retorna null se ele n�o existe
    public No localiza(No raiz, int chave) {
        return null;
    }

    // 3. Conta a quantidade de n�s de uma �rvore
    public int contaElementos(No raiz) {
        return -1;
    }

    // 4. Retorna o tamanho em bytes de uma pasta de arquivos
    public int fileSize(No raiz, int chave) {
        return -1;
    }

    // 5. Retorna o tamanho total em bytes a partir da raiz da pasta de arquivos
    public int totalSize(No raiz) {
        return 0;
    }

    // 6. Retorna o nivel de um n�
    public int getNivel(No raiz, int chave) {
        return -1;
    }

    // 7. Descobre o irm�o de um n�
    public No getIrmao(No raiz, int valor) {
        return null;
    }

    private No _getIrmao(No pai, No corrente, int valor) {
        return null;
    }

    // 7. Descobre a profundidade da �rvore
    public int getProf(No raiz) {
        return -1;
    }
}