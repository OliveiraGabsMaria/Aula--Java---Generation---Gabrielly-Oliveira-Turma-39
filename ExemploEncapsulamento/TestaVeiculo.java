package br.com.generation.ExemploEncapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a marca do Veículo: ");
		String marca = scan.next();
		
		Veiculo vc = new Veiculo();
		
		vc.setMarca(marca); //Alterando o atributo marca através do método setMarca
		
		System.out.println("Marca do Veículo: " + vc.getMarca()); //" --> Recuperando os dados do atributo marca através do método getMarca"

		scan.close();

	}

}
