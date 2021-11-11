package br.com.generation.Exercicios11Nov;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] val = new int[3][3];
		int somaVal = 0;
		int somaDiag = 0;
		
		for(int l = 0; l < val.length; l++) {
			for(int c = 0; c < val[l].length; c++) {
				System.out.println("Digite os valores "
						+ "para preencher a matriz: ");
			val[l][c] = scan.nextInt();
			somaVal += val[l][c];
			
			if(l == c) {
				somaDiag += val[l][c];
			}
			}
		}
		System.out.println("O resultado da soma completa é: " + somaVal);
		System.out.println("O resultado da soma da Diagonal Principal: " + somaDiag);
		
		scan.close();
	}

}
