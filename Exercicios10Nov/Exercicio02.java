package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int impar = 0, par = 0, numero;
		
		for(int v = 1; v <= 10; v++) {
		System.out.println("Digite um numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
      }
		System.out.println("A quantidade de n�meros par � : " + par + " e impar �: " + impar);
		
		leia.close();
	}

}
