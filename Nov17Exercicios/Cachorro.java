package br.com.generation.Nov17Exercicios;

public class Cachorro extends Animal{

	@Override
	public void nome() {
		System.out.println("Nome do cachorro: Bellinha");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade do cachorro: 4 anos");
		
	}

	@Override
	public void somE() {
		System.out.println("Som emitido pelo cachorro: AuAuAu");
		
	}
	@Override
	public void movimento() {
		System.out.println("Movimentação do cachorro: correndo");
	}


}
