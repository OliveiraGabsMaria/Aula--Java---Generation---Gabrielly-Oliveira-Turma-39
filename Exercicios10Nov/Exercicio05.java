package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* 5- Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);

		int numero;
		int soma = 0;
		
		do {
		System.out.println("Digite um n�mero do teclado:");
		numero = leia.nextInt();
		soma = soma + numero;
		
		}
		while(numero != 0);
		System.out.println("O resultado da soma dos n�meros �: " + soma);
		leia.close();
	}

}
