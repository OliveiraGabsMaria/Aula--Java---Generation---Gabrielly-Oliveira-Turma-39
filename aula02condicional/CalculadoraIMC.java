package br.com.generation.aula02condicional;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double imc;
		double pesoQuilogramas = 0.0;
		double alturaMetros = 0.0;
		
		System.out.println("Digite o peso atual: ");
		pesoQuilogramas = entrada.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		alturaMetros = entrada.nextDouble();
		
		imc = pesoQuilogramas / (alturaMetros*alturaMetros);
		
		System.out.println("\nValores do IMC");
		
		System.out.println("Abaixo do Peso: Menos que 18.5");
		System.out.println("Normal: Entre 18,5 e 24,9");
		System.out.println("Sobrepeso: Entre 25,0 e 29,9");
		System.out.println("Obeso: Acima de 30,0");
		System.out.println("\nSeu IMC é: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		}
		if(imc > 18.5 && imc < 24.9) {
			System.out.println("Você está como peso normal!");
		}
		if(imc > 25.0 && imc < 29.9) {
			System.out.println("Você está com sobrepeso!");
		}
		if(imc > 30.0) {
			System.out.println("Você está obeso!");
		}
		
		entrada.close();

	}

}
