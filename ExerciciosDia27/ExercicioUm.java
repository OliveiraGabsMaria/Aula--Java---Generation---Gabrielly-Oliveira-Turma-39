package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int dias, meses, anos, idade;

		System.out.println("Quantos anos voc� tem? ");
		
		anos = leia.nextInt();

		System.out.println("Quantos meses faz que voc� completou " + anos + " anos? ");
		meses = leia.nextInt();

		System.out.println("Quantos dias faz que voc� completou  " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();

		idade = (365 * anos) + (30 + meses) + dias;

		System.out.println("Voc� sofre h� " + idade + " dias.");
		
		leia.close();
	}

}
