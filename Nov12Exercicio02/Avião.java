package br.com.generation.Nov12Exercicio02;

import java.util.Scanner;

public class Avi�o {

	public static void main(String[] args) {
		
		Scanner insira = new Scanner(System.in);
		
		String assento, nome;
		int horaE, horaP;
	    String localE, localP;

		horaE = 06;
		horaP = 15;
		
		System.out.println("=========================================");
		System.out.println("=                                       =");
		System.out.println("=   CONFIRME SEU HOR�RIO DE EMBARQUE    =");
		System.out.println("=             E DE POUSO                =");
		System.out.println("=========================================");
		System.out.println("Insira seu nome: ");
		nome = insira.next();
		System.out.println("Insira seu assento: ");
		assento = insira.next();
		System.out.println("Insira o lugar de embarque: ");
		localE = insira.next();;
			System.out.println("Informe seu destino: ");
		localP = insira.next();
		
		CriaAvi�o voar = new CriaAvi�o();
		voar.setNome(nome);
		voar.setAssento(assento);
		voar.setLocalE(localE);
		voar.setLocalP(localP);
		
		System.out.println("..................Carregando................");
		System.out.println("Seus dados: "
				+ "\nNome: " + voar.getNome());
		System.out.println("Seu assento: " + voar.getAssento());
		System.out.println("Seu local de embarque: " + voar.getLocalE()
		+ "\nSeu local de destino: " + voar.getLocalP());
		System.out.println("Seus embarque � �s: " + horaE + "hrs e o pouso �s:" + horaP + "hrs.");
		voar.lembrete();
		
		insira.close();
	}

}
