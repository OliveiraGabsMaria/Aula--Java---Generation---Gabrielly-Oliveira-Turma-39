package br.com.generation.aula03For;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int desespero = 0, entendimento = 10;
				desespero <=10 && entendimento >= 0; 
				desespero ++, entendimento--) {
			
			System.out.println(desespero + " | " + entendimento);
			
			Thread.sleep(500);
			
		}
	}

}
