package br.com.generation.Nov12Exercicio04;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
	FuncionarioCria fun1 = new FuncionarioCria();
	FuncionarioCria fun2 = new FuncionarioCria();
	FuncionarioCria fun3 = new FuncionarioCria();
	String login;
	int senha;
	Scanner insira = new Scanner(System.in);
	
	for(int i = 0; i <= 3; i++) {
		System.out.println("===========================");
		System.out.println("=      FA�A SEU LOGIN     =");
		System.out.println("===========================");
		System.out.println("     Digite seu login: ");
		login = insira.next();
		System.out.println("     Digite sua senha: ");
		senha = insira.nextInt();
		if(senha == 12345) {
			fun1.setLogin(login);
			fun1.setSenha(senha);
			System.out.println("Dados do Funcion�rio: "
					+ "\nLogin: " + fun1.getLogin()
					+ "\nSenha: " + fun1.getSenha());
			fun1.responsabilidade1();
			
		}
		else if(senha == 54321) {
			fun2.setLogin(login);
			fun2.setSenha(senha);
			System.out.println("Dados do Funcion�rio: "
					+ "\nLogin: " + fun2.getLogin()
					+ "\nSenha: " + fun2.getSenha());
			fun2.responsabilidade2();
		}
		else if(senha == 67890) {
			fun3.setLogin(login);
			fun3.setSenha(senha);
			System.out.println("Dados do Funcion�rio: "
					+ "\nLogin: " + fun3.getLogin()
					+ "\nSenha: " + fun3.getSenha());
			fun3.responsabilidade3();
		}
		else {
			System.out.println("Voc� n�o trabalha nessa empresa.........");
		}
	}
	insira.close();

	}

}
