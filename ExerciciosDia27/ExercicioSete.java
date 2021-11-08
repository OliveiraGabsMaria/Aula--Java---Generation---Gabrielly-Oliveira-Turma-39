package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F;
		double x, y;

		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();

		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();

		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();

		System.out.println("Digite o valor de D: ");
		D = leia.nextDouble();

		System.out.println("Digite o valor de E: ");
		E = leia.nextDouble();

		System.out.println("Digite o valor de F: ");
		F = leia.nextDouble();

		x = ((C*E) - (B*F)) / ((A*E) - (B*D));
		y = ((A*F) - (C*D)) / ((A*E) - (B*D));

		System.out.println("O valor de X é: " + x + " e o valor de Y é: " + y);
		
		leia.close();


	}

}
