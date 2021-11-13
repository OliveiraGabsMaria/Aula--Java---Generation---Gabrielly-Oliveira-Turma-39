package br.com.generation.Nov12Exercicio01;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {

		String nome, passagem;
		int idade, filhos;
		
		CriaCliente dados = new CriaCliente();
		
		Scanner insira = new Scanner(System.in);
		
		System.out.println("====================================");
		System.out.println("=        BEM VINDE AO NOSSO        =");
		System.out.println("=               SITE               =");
		System.out.println("====================================");
		System.out.println("Insira, por gentileza, o seu nome: ");
		nome = insira.next();
		System.out.println("Certo, " + nome + ". Agora insira sua idade:");
		idade = insira.nextInt();
		System.out.println("Estamos quase finalizando!");
		System.out.println("Digite, por favor, a quantidade de filhos que irão"
				+ " na excursão:");
		filhos = insira.nextInt();
		System.out.println("Muito bem! Nessa última etapa, nos diga qual será o destino:");
		passagem = insira.next();
		
		dados.setNome(nome);
		dados.setIdade(idade);
		dados.setFilhos(filhos);
		dados.setPassagem(passagem);
		
		dados.viajar();
		System.out.println("====================================");
		System.out.println("  Confirmação dos dados");
		System.out.println("  Nome: " + dados.getNome());
		System.out.println("  Idade: " + dados.getIdade());
		System.out.println("  Filhos na excursão: " + dados.getFilhos());
		System.out.println("  Local: " + dados.getPassagem());
		
		dados.finalizar();
		
		insira.close();
		
		
		

	}

}
