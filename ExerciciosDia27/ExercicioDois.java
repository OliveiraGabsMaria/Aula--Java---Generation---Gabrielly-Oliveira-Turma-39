package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos;

		System.out.println("Quandos dias faz que voc� sofre? ");
		dias = leia.nextInt();

		anos = (dias / 365);

		meses = ((dias % 365) / 30);

		dias = ((dias % 365) % 30);

		System.out.println("Voc� sofre h� " + anos + " anos, " + meses + " meses e " + dias + "dias.");
		
		leia.close();


	}

}
