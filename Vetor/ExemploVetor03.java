package br.com.generation.Vetor;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		double[] graus = new double[10];
		graus[0] = 25.5;
		graus[1] = 26.8;
		graus[2] = 40.0;
		graus[3] = 32.3;
		graus[4] = 18.7;
		
		System.out.println("Dia 1º de Dezembro: " + graus[0]);
		
		System.out.println("O tamanho do array é: " + graus.length);
		
		for(int i = 0; i <= graus.length; i++) {
			System.out.println((i++) + "º dia: " + graus[i]);
		}

	}

}
