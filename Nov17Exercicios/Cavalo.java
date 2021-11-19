package br.com.generation.Nov17Exercicios;

public class Cavalo extends Animal {

	@Override
	public void nome() {
		System.out.println("Nome do cavalo: Trovão");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade do cavalo: 5 anos");
		
	}

	@Override
	public void somE() {
		System.out.println("Som emitido pelo cavalo: irrriiií");
		
	}
	@Override
	public void movimento() {
		System.out.println("Movimentação do cavalo: correndo");
	}

}
