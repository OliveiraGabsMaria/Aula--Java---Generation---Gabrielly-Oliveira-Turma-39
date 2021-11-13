package br.com.generation.Nov12Exercicio05;

import java.util.Scanner;

public class Patinete {

	public static void main(String[] args) {
		Scanner insira = new Scanner(System.in);
		PatineteCria part = new PatineteCria();
		String cor;
		int tempouso, i;
		double preco;
		
		System.out.println("========================");
		System.out.println("=    PESQUISA SOBRE    =");
		System.out.println("=       PATINETES      = ");
		System.out.println("========================");
		System.out.println("Você tem um patinete?"
				+ "\nInsira:"
				+ "\n1- Para sim"
				+ "\n2- Para não");
		i = insira.nextInt();
		if(i == 1) {
			System.out.println("Qual a cor dele?");
			cor = insira.next();
			System.out.println("Qual o tempo de uso?");
			tempouso = insira.nextInt();
			System.out.println("Qual o preço pago por ele?");
			preco = insira.nextDouble();
			
			part.setCor(cor);
			part.setTempouso(tempouso);
			part.setPreco(preco);
			System.out.println("Suas respostas nessa pesquisa foram:"
					+ "\nReferente a cor: " + part.getCor()
					+ "\nReferente a tempo de uso: " + part.getTempouso()
					+ "\nReferente a preço: " + part.getPreco());
			part.patinete();
		}
		else {
			part.patinete();
		}
		insira.close();
		
	}

}
