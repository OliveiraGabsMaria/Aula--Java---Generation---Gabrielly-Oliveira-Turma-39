package br.com.generation.Exerciciosdia09Nov;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é infantil.");
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é junevil.");
		}
		if(idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria é adulto.");
		}
		else {
			System.out.println("Esse idade não se classifica em nenhuma categoria.");
		}

		leia.close();

	}

}
