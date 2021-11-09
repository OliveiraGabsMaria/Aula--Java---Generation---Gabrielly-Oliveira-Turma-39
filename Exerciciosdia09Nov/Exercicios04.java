package br.com.generation.Exerciciosdia09Nov;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			double numeroRaiz = Math.sqrt(numero);
			System.out.println("\nO número é par."
					+"\nA raiz quadrada desse numero é: " + numeroRaiz);
		}
		else {
			double numeroPot = Math.pow(numero, 2);
			System.out.println("\nO número é impar."
					+ "\nO resultado de " + numero + " elevado ao quadrado será: " + numeroPot);
		}
		
		leia.close();


	}

}
