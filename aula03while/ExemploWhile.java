package br.com.generation.aula03while;

public class ExemploWhile {
	
   //la�o de repeti��o --> Enquanto
	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println("Repeti��o: nr. " + contador);
			contador++;
			Thread.sleep(1000);
		}

	}

}
