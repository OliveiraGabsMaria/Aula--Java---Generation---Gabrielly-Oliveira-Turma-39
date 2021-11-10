package br.com.generation.aula03while;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = -1;
		
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero == 0) {
				System.out.println("Final da contagem...");
			}
		}
		
		leia.close();


	}

}
