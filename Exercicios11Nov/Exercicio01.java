package br.com.generation.Exercicios11Nov;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vp = new double[5];
		double mp;
		
		System.out.println("Digite os cinco valores de pontuação: ");
		mp = vp[0];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Pontuação " + (i + 1) + "º");
			vp[i] = scan.nextDouble();
			
			if(mp < vp [i]) {
				mp = vp[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(vp[i] + "|");
		}
		System.out.println("A maior pontuação foi: " + mp);
		
		scan.close();


	}

}
