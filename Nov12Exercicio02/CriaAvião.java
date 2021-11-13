package br.com.generation.Nov12Exercicio02;

public class CriaAvião {

	private String assento, nome;
	int horaE, horaP;
	private String localE, localP;
	
	
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLocalE() {
		return localE;
	}
	public void setLocalE(String localE) {
		this.localE = localE;
	}
	public String getLocalP() {
		return localP;
	}
	public void setLocalP(String localP) {
		this.localP = localP;
	}
	void lembrete() {
		System.out.println("Chegar ao portão de embarque com 30min de antedencia!!!!");
	}
			
	
}
