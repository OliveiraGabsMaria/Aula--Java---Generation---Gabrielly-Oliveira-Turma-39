package br.com.generation.Nov12Exercicio01;

public class CriaCliente {
	

	private String nome, passagem;
	private int idade, filhos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassagem() {
		return passagem;
	}

	public void setPassagem(String passagem) {
		this.passagem = passagem;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getFilhos() {
		return filhos;
	}

	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}
	
	void viajar() {
		System.out.println("Parabéns, você finalizou suas reservas!");
	}
	void finalizar() {
		System.out.println("Faça uma boa viagem!");
	}
	
	
}
