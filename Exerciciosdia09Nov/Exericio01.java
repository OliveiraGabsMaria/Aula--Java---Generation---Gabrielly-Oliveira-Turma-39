package br.com.generation.Exerciciosdia09Nov;

import java.util.Scanner;

public class Exericio01 {

	public static void main(String[] args) {
		
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);

		int valor1, valor2, valor3;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		valor3 = leia.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1);
			
		}
		if(valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor é: " + valor2);
			
		}
		if(valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor é: " + valor3);
		}
		
		leia.close();
		

	}

}
