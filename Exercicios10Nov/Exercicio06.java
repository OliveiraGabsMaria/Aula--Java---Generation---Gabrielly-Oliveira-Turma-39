package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/* 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0, i = 0;
		double mediam3 = 0;
		
		do {
			System.out.println("Digite um numero:");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				i++;
				soma = soma + numero;
			}
		}
		while(numero != 0);
		mediam3 = soma/i;
		System.out.println("A m�dia dos numeros multiplos de 3 �: " + mediam3);
		
		leia.close();
	}

}
