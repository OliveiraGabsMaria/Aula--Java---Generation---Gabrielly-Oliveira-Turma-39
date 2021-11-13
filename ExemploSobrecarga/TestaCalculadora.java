package br.com.generation.ExemploSobrecarga;

public class TestaCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora mc = new MinhaCalculadora();
		
		System.out.println("Soma 1: " + mc.soma(8.7, 10.7777));
		System.out.println("Soma 2: " + mc.soma(10, 9.5, 50));

	}

}
