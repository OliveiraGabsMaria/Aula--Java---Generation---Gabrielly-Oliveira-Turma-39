package br.com.generation.Exerciciosdia09Nov;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
				�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			double numeroRaiz = Math.sqrt(numero);
			System.out.println("\nO n�mero � par."
					+"\nA raiz quadrada desse numero �: " + numeroRaiz);
		}
		else {
			double numeroPot = Math.pow(numero, 2);
			System.out.println("\nO n�mero � impar."
					+ "\nO resultado de " + numero + " elevado ao quadrado ser�: " + numeroPot);
		}
		
		leia.close();


	}

}
