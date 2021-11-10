package br.com.generation.Exercicios10Nov;

public class Exericio01 {

	public static void main(String[] args) throws InterruptedException {
		/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
		
		System.out.println("Numeros de 1000 a 1999 quando divididos por 11, o resto é igual a 5:");
		for(int n1 = 1000; n1 < 2000; n1++) {
			
			if(n1 % 11 == 5) {
				Thread.sleep(500);
				System.out.println(n1);
			
				
			}
			
		}

	}

}
