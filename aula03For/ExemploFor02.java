package br.com.generation.aula03For;

public class ExemploFor02 {

	public static void main(String[] args) {
		
		int n = 20;
		int i, soma;
		
		//(inicialização; condição; incremento++; decremento--;)
		
		for(i = 0, soma = 0; i <= n; i++) {
			
			System.out.println("Soma: " + soma + " + " + i);
			soma = soma + i;
			System.out.print(" = " + soma +"\n");
	}
	}

}
