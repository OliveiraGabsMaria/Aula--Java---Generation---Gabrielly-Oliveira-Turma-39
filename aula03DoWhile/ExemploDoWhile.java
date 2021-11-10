package br.com.generation.aula03DoWhile;

public class ExemploDoWhile {
	
	//laço de Repetição --> Faça - Enquanto
	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println( i );
			i++;
			Thread.sleep(500);
		}
		while(i <= 10);

	}

}
