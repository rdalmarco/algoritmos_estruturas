package  udesc.br.algoritmoeuclides;

import java.util.Scanner;

public class ExemploProfessor {

	private class No {
		public int dividendo = 0;
		public int divisor = 0;
		public No prox = null;
		public No ant = null;
	}
	
	private int dividendo = 0;
	private int divisor = 0;
	
	public ExemploProfessor (int dividendo, int divisor){
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	// Utilizando o algor�tmo de Euclides, gera uma lista din�mica com todas as
	// divis�es efetuadas.
	private No mdcEuclidiano(int dividendo, int divisor) {
		No head = new No();
		head.dividendo = dividendo;
		head.divisor = divisor;
		head.prox = null;
		No aux = head;

		while ((dividendo % divisor) != 0) {
			int resto = dividendo % divisor;

			No novo = new No();
			novo.dividendo = aux.divisor;
			novo.divisor = resto;
			novo.ant = aux;
			aux.prox = novo;
			aux = novo;

			dividendo = novo.dividendo;
			divisor = novo.divisor;
		}

		return head;
	}

	// Imprime a sequ�ncia de divis�es gerada pelo algor�tmo
	public void imprime(No head) {
		No aux = head;
		String msg = "";

		while (aux.prox != null) {
			msg += "[" + aux.dividendo + "," + aux.divisor + "] ";
			aux = aux.prox;
		}
		msg += "[" + aux.dividendo + "," + aux.divisor + "] ";
		System.out.println("MDC: " + aux.divisor);
		System.out.println(msg);

	}

	public No start() {
		return mdcEuclidiano(dividendo, divisor);
	}

}