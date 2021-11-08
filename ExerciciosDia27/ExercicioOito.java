package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int custoF, totalC;
		
		System.out.println("Qual o custo de fábrica do veículo? ");
		custoF = leia.nextInt();

		totalC = ((custoF / 100) * 28) + ((custoF / 100) * 45) + custoF;

		System.out.println("O valor do custo ao consumidor é de " + totalC + " reais.");
		
		leia.close();


	}

}
