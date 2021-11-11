package br.com.generation.Exercicios11Nov;

public class Exercicio02 {

	public static void main(String[] args) {

	int[] dado = new int[10];
	
	int mp = 0;
	double media = 0.0, soma = 0.0;
	 
	System.out.println("Sorteio iniciando");
	for(int v = 0; v < 10; v++) {
	     dado[v] = ((int)(1 + Math.random()*6));
	     
	     soma = soma + dado[v];
	     media = soma / 10;
	     System.out.println("Valores: " + dado[v]);
	     if(dado[v] >=6) {
	    	 mp++;
	     }
	}
	System.out.println("A média artimética dos lançamentos é: " + media);
	System.out.println("As ocorrências da maior pontuação foram: " + mp);

	}

}
