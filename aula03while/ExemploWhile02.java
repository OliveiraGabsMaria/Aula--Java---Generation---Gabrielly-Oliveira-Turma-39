package br.com.generation.aula03while;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 10;
		
		while(contador >= 0) {
			System.out.println("Repetição: nr" + contador);
			contador--;
			Thread.sleep(500);
		}

	}

}
