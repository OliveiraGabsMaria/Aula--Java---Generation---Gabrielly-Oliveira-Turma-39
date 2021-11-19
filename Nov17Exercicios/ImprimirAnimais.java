package br.com.generation.Nov17Exercicios;

public class ImprimirAnimais {
	
public static void main(String[] args) {
		
		TestaAnimais t = new TestaAnimais();
		
		t.nomeAnimal(new Cachorro());
		t.idadeAnimal(new Cachorro());
		t.somAnimal(new Cachorro());
		t.movimento(new Cachorro());
		
		System.out.println("-----------------------------------");
		
		t.nomeAnimal(new Cavalo());
		t.idadeAnimal(new Cavalo());
		t.somAnimal(new Cavalo());
		t.movimento(new Cavalo());
		
		System.out.println("-----------------------------------");
		
		t.nomeAnimal(new Preguica());
		t.idadeAnimal(new Preguica());
		t.somAnimal(new Preguica());
		t.movimento(new Preguica());
		

	}


}
