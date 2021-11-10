package br.com.generation.Exercicios10Nov;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, sexo = 0, estadomental = 0, h = 1;
		int nPC = 0, nMN = 0, nHA = 0, nOC = 0, nN40More = 0, nC18Less = 0;
		
		while(h <= 150) {
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
			System.out.println("Digite o genero na qual se identifica:"
					+ "\nPressione: "
					+ "\n1-feminino"
					+ "\n2-masculino "
					+ "\n3-Outros");
			sexo = leia.nextInt();
			System.out.println("Digite como é seu estado mental:"
					+ "\nPressione: "
					+ "\n1-calma"
					+ "\n2-nervosa "
					+ "\n3-agressiva");
			estadomental = leia.nextInt();
			h++;
			if(estadomental == 1) {
				nPC++;
			}
			if(sexo == 1 && estadomental == 2) {
				nMN++;
			}
			if(sexo == 2 && estadomental  == 3) {
				nHA++;
			}
			if(sexo == 3 && estadomental == 1) {
				nOC++;
			}
			if(estadomental == 2 && idade >= 40) {
				nN40More++;
			}
			if(estadomental == 1 && idade <= 18) {
				nC18Less++;

			}
		}
		
		System.out.println("O número de pessoas calmas é: " + nPC
				+ "\nO número de mulheres nervosa é: " + nMN
				+ "\nO número de homens agressivos é: " + nHA
				+ "\nO número de outros calmos é: " + nOC
				+ "\nOnúmero de pessoas nervosas com mais de 40 anos é: " + nN40More
				+ "\nO número de pessoas calmas com menos de 18 anos é: " + nC18Less);
		
		leia.close();

	}

}
