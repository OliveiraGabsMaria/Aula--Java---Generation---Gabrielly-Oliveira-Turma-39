package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
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
		System.out.println("A quantidade de números par é : " + par + " e impar é: " + impar);
		
		leia.close();
	}

}
