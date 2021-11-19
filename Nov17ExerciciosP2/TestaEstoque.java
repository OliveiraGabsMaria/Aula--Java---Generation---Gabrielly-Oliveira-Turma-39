package br.com.generation.Nov17ExerciciosP2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Estoque> estoque = new ArrayList<Estoque>();
		
		System.out.println("Quantos tipos de produto você deseja inserir: ");
		int tipos = sc.nextInt();
		
		sc.nextLine();
		
		
		for(int i = 0; i < tipos; i++) {
			System.out.println("\nQual produto você deseja inserir: ");
			String produto = sc.next();
			
			System.out.println("Digite a quantidade: ");
			int quantidade = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Digite o preço do produto: R$ ");
			double preco = sc.nextDouble();//variavel local, só vai servir dentro desse for
		
			sc.nextLine();
			
			System.out.println("Digite o fornecedor do produto: ");
			String fornecedor = sc.next();
			
			estoque.add(new Estoque(produto, quantidade, preco, fornecedor));//

		}
		for(Estoque es : estoque) {
			System.out.println("\n" + es);
			
			System.out.println();

		}
		sc.close();

}
}