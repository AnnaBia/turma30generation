package Lista3;

import java.util.Scanner;

public class Tarefa3 {
	
		/*
		 	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 			Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
  		*/
 
	public static void main (String args[]) {
			
			Scanner read = new Scanner(System.in);
			int idade=0,menos21=0,mais50=0;
			

			while(idade != -99) {
				System.out.print("Entre com uma idade, ou digite -99 para encerrar : ");
				idade = read.nextInt();

				if(idade < 21 && idade > 0){
					menos21++;
				} 
				else if (idade > 50){
					mais50++;
				}

			}

			System.out.printf("\nPessoas com menos de 21 anos : %d", menos21);
			System.out.printf("\nPessoas com mais de 50 anos : %d", mais50);
			read.close();
		}
		   	
	}
