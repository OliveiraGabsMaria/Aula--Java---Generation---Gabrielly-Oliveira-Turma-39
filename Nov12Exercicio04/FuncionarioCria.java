package br.com.generation.Nov12Exercicio04;

public class FuncionarioCria {

	private String login;
	private int senha;
	
	void responsabilidade1() {
		System.out.println("Sua fun��o � de desenvolvedor Junior.");
		System.out.println("Limpar os c�digos.......");
	}
	void responsabilidade2() {
		System.out.println("Sua fun��o � de desenvolvedor Senior.");
		System.out.println("Planejar o Pitch semanal.......");
	}
	void responsabilidade3() {
		System.out.println("Sua fun��o � de desenvolvedor Pleno.");
		System.out.println("Orientar Projeto Integrador......");
		
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
