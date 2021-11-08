package br.com.generation.ExerciciosDia27;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int segundos, minutos, horas;

		System.out.println("Quantos segundos dura o evento? ");
		segundos = leia.nextInt();

		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) / 60);

		System.out.println("Evento durou por: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		leia.close();

	}

}
