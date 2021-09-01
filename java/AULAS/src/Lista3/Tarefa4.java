package Lista3;

import java.util.Scanner;

public class Tarefa4 {
				/*
			 	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
			 	Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as 
			 	opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se
			 	para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
				•	o número de pessoas calmas; 
				•	o número de mulheres nervosas; 
				•	o número de homens agressivos; 
				•	o número de outros calmos;
				•	o número de pessoas nervosas com mais de 40 anos; 
				•	o número de pessoas calmas com menos de 18 anos.
			 */
	public static void main (String args[]) {
			Scanner leia = new Scanner(System.in);
			int idade=0;
			char sexo;  //(1-feminino / 2-masculino / 3-Outros)
			char opcoes; //(1, pessoa calma; 2 pessoa nervosa; 3 pessoa agressiva).
			int contadorPessoas=0;
			char op='S';
			final int LIMITE_PESSOAS_ENTREVISTADAS=150;
			int numeroPessoasCalmas=0; 
			int numeroMulheresNervosas=0; 
			int numeroHomensAgressivos=0; 
			int numeroOutrosCalmos=0;
			int numeroPessoasNervosasMais40Anos=0;
			int numeroPessoasCalmasMenos18Anos=0;

			while(contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS && op=='S') {
			
				System.out.print("Digite a idade : ");
				idade = leia.nextInt();
				System.out.print("Digite\n1-feminino\n2-masculino\n3-Outros : ");
				sexo = leia.next().charAt(0);
				System.out.print("Digite a opção\n1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva : ");
				opcoes = leia.next().charAt(0);
				contadorPessoas++;
				System.out.println("Continua S/N : ");
				op = leia.next().toUpperCase().charAt(0);
				
				if (opcoes == '1') {
					numeroPessoasCalmas++;
				}		
				if (sexo=='1' && opcoes == '2') {
					numeroMulheresNervosas++;
				}		
				if (sexo=='2' && opcoes == '3') {
					numeroHomensAgressivos++;
				}	
				if(sexo=='3' && opcoes == '1') {
					numeroOutrosCalmos++;
				}				
				if (opcoes=='2' && idade> 40) {
					numeroPessoasNervosasMais40Anos++;
				}			
				if (opcoes=='1' && idade < 18) {
					numeroPessoasCalmasMenos18Anos++;
				}				
			}
			System.out.print("Pessoas calmas " + numeroPessoasCalmas); 
			System.out.print("Mulheres nervosas " + numeroMulheresNervosas); 
			System.out.print("Homens agressivos " + numeroHomensAgressivos); 
			System.out.print("Outros calmos " + numeroOutrosCalmos);
			System.out.print("Pessoas nervosas acima 40 anos " + numeroPessoasNervosasMais40Anos); 
			System.out.print("Pessoas acalmas abaixo 18 anos " + numeroPessoasCalmasMenos18Anos);
	}
}
