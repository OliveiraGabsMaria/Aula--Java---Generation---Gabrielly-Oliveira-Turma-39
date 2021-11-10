package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		Scanner leia = new Scanner(System.in);

		int idade;
		int menor21 = 0 , maior50 = 0;
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		while(idade != -99) {
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		if(idade <= 21) {
			menor21++;
		}
		else if(idade >= 50) {
			maior50++;
		}
		}
		System.out.println("Nessa lista temos:"
				            + menor21 + " pessoas com a idade menor de 21 anos \n"
				            + maior50 + " pessoas com a idade maior de 50 anos");
		
		leia.close();
	}   

}
