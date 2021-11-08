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
		
		
		
		System.out.println("A soma de a com b é: " + soma);
		System.out.println("A subtração de a com b é: " + subtracao);
		System.out.println("A divisão de a por b é: " + divisao1);
		System.out.println("A divisão de b por a é: " + divisao2);
		System.out.println("A multiplicação de a com b é: " + multiplicacao);

		

		leia.close();
		
		

	}

}
