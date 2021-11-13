package br.com.generation.Nov12Exercicio02;

import java.util.Scanner;

public class Avião {

	public static void main(String[] args) {
		
		Scanner insira = new Scanner(System.in);
		
		String assento, nome;
		int horaE, horaP;
	    String localE, localP;

		horaE = 06;
		horaP = 15;
		
		System.out.println("=========================================");
		System.out.println("=                                       =");
		System.out.println("=   CONFIRME SEU HORÁRIO DE EMBARQUE    =");
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
		
		CriaAvião voar = new CriaAvião();
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
		System.out.println("Seus embarque é às: " + horaE + "hrs e o pouso às:" + horaP + "hrs.");
		voar.lembrete();
		
		insira.close();
	}

}
