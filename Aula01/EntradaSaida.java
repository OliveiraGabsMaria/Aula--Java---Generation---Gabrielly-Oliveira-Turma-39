package br.com.generation.Aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, subtracao, divisao1, divisao2, multiplicacao;
		
		System.out.println("Escreva o valor de a: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de b: ");
		b = leia.nextDouble();
		
		soma = a + b;
		
		subtracao = a - b;
		
		divisao1 = a / b;
		
		divisao2 = b / a;
		
		multiplicacao = a * b;
		
		
		
		System.out.println("A soma de a com b �: " + soma);
		System.out.println("A subtra��o de a com b �: " + subtracao);
		System.out.println("A divis�o de a por b �: " + divisao1);
		System.out.println("A divis�o de b por a �: " + divisao2);
		System.out.println("A multiplica��o de a com b �: " + multiplicacao);

		

		leia.close();
		
		

	}

}
