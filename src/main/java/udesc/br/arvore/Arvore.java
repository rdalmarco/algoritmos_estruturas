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
        if (raiz != null) {
            System.out.println(raiz.getValor() + " ");
            caminhaPreFixado(raiz.getEsquerda());
            caminhaPreFixado(raiz.getDireita());
        }
    }

    public void caminhaPosFixado(No raiz) {
        if (raiz != null) {
            caminhaPosFixado(raiz.getEsquerda());
            caminhaPosFixado(raiz.getDireita());
            System.out.println(raiz.getValor() + " ");
        }
    }

    public void caminhaCentral(No raiz) {
        if (raiz != null) {
            caminhaCentral(raiz.getEsquerda());
            System.out.println(raiz.getValor() + " ");
            caminhaCentral(raiz.getDireita());
        }
    }

    public boolean remove(No pai, No corrente, int valor) {
        //Nó folha
        if (corrente.getEsquerda() == null && corrente.getDireita() == null) {
            removeFolha(null, corrente);
        } else { //Apenas um filho
            if (corrente.getEsquerda() == null || corrente.getDireita() == null) {
                removeGrau1(null, corrente);
            } else { //Nó com dois filhos
                removeGrau2ComSucessor(null, corrente);
                //RemoveGrau2ComAntecessor(null, corrente);
            }
        }
        return true;
    }

    public boolean removeFolha(No pai, No corrente) {
        return true;
    }

    public boolean removeGrau1(No pai, No corrente) {
        return true;
    }

    public boolean removeGrau2ComSucessor(No pai, No corrente) {
        return true;
    }

    public boolean localizaRemove(No corrente, int valor) {
        if (corrente == null) {
            return false;
        } else {
            if (corrente.getValor() == valor) {
                remove(null, corrente, valor);
                return true;
            } else if (valor > corrente.getValor()) {
                localizaRemove(raiz.getDireita(), valor);
            } else {
                if (valor > corrente.getValor()) {
                    localizaRemove(raiz.getEsquerda(), valor);
                }
            }
        }
        return true;
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
