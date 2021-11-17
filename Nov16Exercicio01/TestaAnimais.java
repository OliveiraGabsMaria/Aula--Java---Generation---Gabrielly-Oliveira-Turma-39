package br.com.generation.Nov16Exercicio01;

public class TestaAnimais {
public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo cv1 = new Cavalo();
		Preguica pg1 = new Preguica();
		
		
		c1.setNome("Bellinha");
		c1.setIdade(4);
		c1.setEmitirSom("AuAuAu");
		c1.setCorrer("Bellinha está correndo");
		
		cv1.setNome("Trovão");
		cv1.setIdade(5);
		cv1.setEmitirSom("iiirrrri");
		cv1.setCorrer("Trovão está correndo");
		
		pg1.setNome("Flecha");
		pg1.setIdade(6);
		pg1.setEmitirSom("Som de preguiça");
		pg1.setSubirArvore("Flecha está subindo na árvore");
		
		
		System.out.println("Nome do cachorro: " + c1.getNome());
		System.out.println("Idade do cachorro: " + c1.getIdade() + " anos.");
		System.out.println("Som emitido pelo cachorro: " + c1.getEmitirSom());
		System.out.println("Movimentação do cachorro: " + c1.getCorrer());
		
		System.out.println();
		
		System.out.println("Nome do cavalo: " + cv1.getNome());
		System.out.println("Idade do cavalo: " + cv1.getIdade() + " anos.");
		System.out.println("Som emitido pelo cavalo: " + cv1.getEmitirSom());
		System.out.println("Movimentação do cavalo: " + cv1.getCorrer());
		
		System.out.println();
		
		System.out.println("Nome da preguiça: " + pg1.getNome());
		System.out.println("Idade da preguiça: " + pg1.getIdade() + " anos.");
		System.out.println("Som emitido pela preguiça: " + pg1.getEmitirSom());
		System.out.println("Movimentação da preguiça: " + pg1.getSubirArvore());
	}

}
