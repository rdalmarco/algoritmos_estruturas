package udesc.br.arvore;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Arvore arvore = new Arvore();
		arvore.insere(arvore.getRaiz(), 20, "Arq 1", 10);
		arvore.insere(arvore.getRaiz(), 15, "Arq 2", 20);
		arvore.insere(arvore.getRaiz(), 30, "Arq 3", 30);
		//arvore.insere(arvore.getRaiz(), 2, "Arq 4", 40);
		//arvore.insere(arvore.getRaiz(), 17, "Arq 5", 50);
		//arvore.insere(arvore.getRaiz(), 45, "Arq 6", 60);
		//arvore.insere(arvore.getRaiz(), 1, "Arq 7", 70);
		//arvore.insere(arvore.getRaiz(), 18, "Arq 8", 80);
		//arvore.insere(arvore.getRaiz(), 35, "Arq 9", 90);
		//arvore.insere(arvore.getRaiz(), 60, "Arq 10", 100);
		//arvore.insere(arvore.getRaiz(), 32, "Arq 11", 110);
		//arvore.insere(arvore.getRaiz(), 80, "Arq 12", 120);
		//arvore.insere(arvore.getRaiz(), 48, "Arq 13", 130);
		//arvore.insere(arvore.getRaiz(), 25, "Arq 14", 140);
		//arvore.insere(arvore.getRaiz(), 90, "Arq 15", 150);
		
		arvore.caminhaPosFixado(arvore.getRaiz());
                System.out.println("--------");
		arvore.caminhaCentral(arvore.getRaiz());
                System.out.println("--------");
		arvore.caminhaPreFixado(arvore.getRaiz());
                		//System.out.println(arvore.vazio());
		
		//No no = arvore.localiza(arvore.getRaiz(), 335);
		//if (no != null)
		//	System.out.println(no.getValor() );
		//else
		//	System.out.println("N�o encontrado");
		//System.out.println(arvore.contaElementos(arvore.getRaiz()));

		
		//System.out.println(arvore.fileSize(arvore.getRaiz(), 25));
		//System.out.println(arvore.totalSize(arvore.getRaiz()));
		//System.out.println(arvore.getNivel(arvore.getRaiz(), 800));
		
		
		/*
		
		while (true){
			System.out.println("|--------------------------------------------|");
			System.out.println("|   PROGRAMA ARVORE BINARIA                  |");
			System.out.println("|1- INSERIR                                  |");
			System.out.println("|2- REMOVER                                  |");
			System.out.println("|3- CONTAR ELEMENTOS                         |");
			System.out.println("|4- LOCALIZAR                                |");
			System.out.println("|5- CAMINHAMENTO CENTRAL                     |");
			System.out.println("|6- CAMINHAMENTO PR�-FIXADO                  |");
			System.out.println("|7- CAMINHAMENTO P�S-FIXADO                  |");
			System.out.println("|8- DESCOBRIR IRM�O DE UM NODO               |");
			System.out.println("|9- DESCOBRIR PROFUNDIDADE DA ARVORE (ALTURA)|");
			System.out.println("|10- DESCOBRIR DISTANCIA DE UM NODO          |");
			System.out.println("|       (EM RELA��O � RAIZ)                  |");
			System.out.println("|11- TAMANHO DE UM ARQUIVO                   |");
			System.out.println("|12- TAMANHO TOTAL (TODOS OS ARQUIVOS)       |");
			System.out.println("|13- SAIR                                    |");
			System.out.println("|--------------------------------------------|");
			System.out.print("INFORME A SUA OPCAO: ");
			int opcao = s.nextInt();
			if (opcao == 13)
				break;

			int chave = 0;
			switch (opcao){
			case 1:
				//System.out.println("INSERIR ELEMENTO NA ARVORE- INFORME O VALOR A SER INSERIDO: ");
				//valor = s.nextInt();
				//arvore.insere(arvore.getRaiz(), valor);
				arvore.insere(arvore.getRaiz(), 20, "teste", 10);
				arvore.insere(arvore.getRaiz(), 15, "teste", 10);
				arvore.insere(arvore.getRaiz(), 30, "teste", 10);
				arvore.insere(arvore.getRaiz(), 2, "teste", 10);
				arvore.insere(arvore.getRaiz(), 17, "teste", 10);
				arvore.insere(arvore.getRaiz(), 45, "teste", 10);
				arvore.insere(arvore.getRaiz(), 1, "teste", 10);
				arvore.insere(arvore.getRaiz(), 18, "teste", 10);
				arvore.insere(arvore.getRaiz(), 35, "teste", 10);
				arvore.insere(arvore.getRaiz(), 60, "teste", 10);
				arvore.insere(arvore.getRaiz(), 32, "teste", 10);
				arvore.insere(arvore.getRaiz(), 80, "teste", 10);
				arvore.insere(arvore.getRaiz(), 48, "teste", 10);
				arvore.insere(arvore.getRaiz(), 25, "teste", 10);
				arvore.insere(arvore.getRaiz(), 90, "teste", 10);
				break;
			case 2:
				System.out.println("REMOVER ELEMENTO NA ARVORE- INFORME O VALOR A SER REMOVIDO");
				chave = s.nextInt();
				if (arvore.remove(null, arvore.getRaiz(), chave))
					System.out.println("Valor removido com sucesso!!");
				else
					System.out.println("Valor n�o foi removido!!");
				break;
			case 3:
				System.out.println("CONTAGEM DE ELEMENTOS DA ARVORE");
				System.out.println("Quantidade de elementos da �rvore: " + arvore.contaElementos(arvore.getRaiz()));
				break;
			case 4:
				System.out.println("VERIFICAR SE ELEMENTO EXISTE NA ARVORE- INFORME O VALOR A LOCALIZAR");
				chave = s.nextInt();
				No no = arvore.localiza(arvore.getRaiz(), chave);
				if (no != null)
					System.out.println("Valor existe!!");
				else
					System.out.println("Valor n�o existe!!");
				break;
			case 5:
				System.out.println("LISTA DE ELEMENTOS - CAMINHAMENTO CENTRAL");
				arvore.caminhaCentral(arvore.getRaiz());
				break;
			case 6:
				System.out.println("LISTA DE ELEMENTOS - CAMINHAMENTO PR�-FIXADO");
				arvore.caminhaPreFixado(arvore.getRaiz());
				break;
			case 7:
				System.out.println("LISTA DE ELEMENTOS - CAMINHAMENTO P�S-FIXADO");
				arvore.caminhaPosFixado(arvore.getRaiz());
				break;
			case 8:
				System.out.println("DESCOBRIR O IRM�O DE UM NODO - INFORME O NODO REFER�NCIA");
				chave = s.nextInt();
				No irmao = arvore.getIrmao(arvore.getRaiz(), chave);
				if (irmao != null)
					System.out.println(irmao.getValor());
				else
					System.out.println("N�o possui irm�o");
				break;
			case 9:
				int prof = arvore.getProf(arvore.getRaiz());
				System.out.println("A profundidade �: " + prof);
				break;
			case 10:
				System.out.println("DESCOBRIR A DISTANCIA DE UM NODO - INFORME O NODO REFER�NCIA");
				chave = s.nextInt();
				int dist = arvore.getDistancia(arvore.getRaiz(), chave);
				if (dist >= 0)
					System.out.println("A dist�ncia �: " + dist);
				else
					System.out.println("N�o localizado");
				break;
			case 11:
				System.out.println("DESCOBRIR O TAMANHO DE UM ARQUIVO - INFORME A CHAVE");
				chave = s.nextInt();
				tamanho = arvore.fileSize(arvore.getRaiz(), chave);
				if (tamanho >= 0)
					System.out.println("O tamanho do arquuvo �: " + tamanho);
				else
					System.out.println("N�o localizado");
				break;
			case 12:
				System.out.println("DESCOBRIR O TAMANHO TOTAL");
				tamanho = arvore.totalSize(arvore.getRaiz());
				if (tamanho >= 0)
					System.out.println("O tamanho da pasta �: " + tamanho);
				else
					System.out.println("N�o localizado");
				break;
			default:
				System.out.println("OP��O INVALIDA!");
				break;
			}
		}
		
		arvore = null;
		System.out.println("****FIM****!");
		*/
	}
}
