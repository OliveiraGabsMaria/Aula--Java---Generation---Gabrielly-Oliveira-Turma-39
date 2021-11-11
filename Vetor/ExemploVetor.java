package br.com.generation.Vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// array ---> arranjo
		int[] arrayVetor = new int [10]; //[0]...[9]
		
		arrayVetor[5] = 500;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println((i + 1) + " | " + arrayVetor[i]);
		}

	}

}
