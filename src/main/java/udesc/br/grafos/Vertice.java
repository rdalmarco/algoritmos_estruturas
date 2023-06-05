package udesc.br.grafos;

import java.util.ArrayList;
import java.util.Iterator;

public class Vertice implements Cloneable{

	public int chave = 0;
	public boolean visitado;
	private ArrayList<Aresta> adjacencias = new ArrayList();
	
	public Vertice(int chave) {
		this.chave = chave;
	}
	
	//public Vertice clone() throws CloneNotSupportedException{
	//	return (Vertice) super.clone();
	//}
	
	public void addAdjacencia(Vertice v, int peso){
		if (v != null){
			Aresta a = new Aresta(v, peso);
			adjacencias.add(a);
		}
	}
	
	public ArrayList<Aresta> getAdjacencias(){
		return adjacencias;
	}
	
	
	public boolean removeAdjacencia(Vertice v){
		Iterator<Aresta> iterator = adjacencias.iterator();
		while (iterator.hasNext())
		{
			Aresta adj = iterator.next();
			if (adj.destino.chave == v.chave){
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAdjacencia(int pos){
		try
		{
			adjacencias.remove(pos);
			return true;
		}
		catch (IndexOutOfBoundsException e){
			return false;
		}
	}
	
	public boolean possuiAdjacencias()
	{
		return adjacencias.size() > 0;
	}
	
	public String print()
	{
		String result = "(" + chave+ "[";
		Iterator<Aresta> iterator = adjacencias.iterator();
		while (iterator.hasNext())
		{
			Aresta adj = iterator.next();
			result += adj.destino.chave + ",";
		}
		
		if (result.length() > 3)
			result = result.substring(0, result.length()-1);
		result += "])";

		return result;
	}
	
}
