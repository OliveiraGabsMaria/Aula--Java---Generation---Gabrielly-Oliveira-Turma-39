package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double p1, p2;
		double d;

		System.out.println("Digite o valor de X de primeiro ponto: ");
		x1 = leia.nextDouble();

		System.out.println("Digite o valor de y de primeiro ponto: ");
		y1 = leia.nextDouble();

		System.out.println("Digite o valor de X de segundo ponto: ");
		x2 = leia.nextDouble();

		System.out.println("Digite o valor de y de segundo ponto: ");
		y2 = leia.nextDouble();

		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);

		d = Math.sqrt((p1 + p2));

		System.out.println("A distancia entre os dois pontos é: " + d);
		
		leia.close();


	}

}
