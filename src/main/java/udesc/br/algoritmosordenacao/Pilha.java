/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.br.algoritmosordenacao;

/**
 *
 * @author 12876163993
 */
public class Pilha {
    
    private Segmento pilha[] = null;
    private int topo = -1;
    
    public Pilha(int tamanho) {
        pilha = new Segmento[tamanho];
    }
    
    public void empilha(Segmento seg){
        pilha[++topo] = seg;
    }
    
    public Segmento desempilha(){
        return pilha[topo--];
    }
    
    public boolean vazia(){
        return topo < 0;
    }
    
    public boolean existeSegmentoNaEsquerda(int esq, int indicePivot){
        return esq < (indicePivot - 1);
    }
   public boolean existeSegmentoNaDireita(int dir, int indicePivot){
        return dir > (indicePivot + 1);
    } 
    
    
    
}
