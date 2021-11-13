package br.com.generation.Nov12Exercicio03;

import java.util.Scanner;

public class ProdutoEletronico {

	public static void main(String[] args) {
		Scanner insira = new Scanner(System.in);
		
		ProdutoEletronicoCria player = new ProdutoEletronicoCria();
		String marca, cor;
		int armazenamento;
		
		System.out.println("==============================");
		System.out.println("=  Participe dessa pesquisa  =");
		System.out.println("=     para usar o player     =");
		System.out.println("==============================");
		System.out.println("Qual sua marca de MP3 preferida?");
		marca = insira.next();
		System.out.println("Qual sua cor predileta de MP3?");
		cor = insira.next();
		System.out.println("Qual a quantidade de armazenamento perfeita?");
		armazenamento = insira.nextInt();
		
		player.agradecimento();
		
		player.setMarca(marca);
		player.setCor(cor);
		player.setArmazenamento(armazenamento);
		System.out.println("__________________________________________________");
		System.out.println("Suas respostas da pesquisa de preferencia foram: ");
		System.out.println("Marca:" + player.getMarca()
		+ "\nCor: " + player.getCor()
		+ "\nArmazenamento: " + player.getArmazenamento());
		System.out.println("__________________________________________________");
		player.tocar();
		
		insira.close();
	}

}
