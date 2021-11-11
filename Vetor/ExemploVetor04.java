package br.com.generation.Vetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		
		for(int i = 0; i <= notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota do aluno:");
			notas[i] = entrada.nextDouble();
			
			soma = soma + notas[i];
			media = soma / 4;
		}
		
		System.out.println("A soma final das notas do aluno é:" + soma
				+ "A Média final das notas do aluno é: " + media);
		
		entrada.close();
	}

}
