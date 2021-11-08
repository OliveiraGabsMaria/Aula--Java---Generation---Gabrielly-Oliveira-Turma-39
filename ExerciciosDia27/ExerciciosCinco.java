package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExerciciosCinco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double notaA, notaB, notaC, notaAT, notaBT, notaCT, mediafinal;
		
		System.out.println("Qual a primeira nota: ");
		notaA = leia.nextDouble();

		System.out.println("Qual a segunda nota: ");
		notaB = leia.nextDouble();

		System.out.println("Qual a terceira nota: ");
		notaC = leia.nextDouble();

		notaAT = (notaA * 2);
		notaBT = (notaB * 3);
		notaCT = (notaC * 5);

		mediafinal = ((notaAT + notaBT + notaCT) / 10);

		System.out.println("A média final do aluno é: " + mediafinal);
		
		leia.close();

	}

}
