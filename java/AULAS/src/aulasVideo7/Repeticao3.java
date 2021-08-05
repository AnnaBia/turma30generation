package aulasVideo7;

import java.util.Scanner;

public class Repeticao3 {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Entre com sua idade : ");
		idade = leia.nextInt();
		
		do {
			System.out.printf("\nSua idade : %d",idade);
			
			if(idade >= 1) {
				System.out.printf("\nVocê é de maior...");
			}
			else {
				System.out.printf("\nVocê é de menor...");
			}
			System.out.printf("\n\nEntre com sua idade : ");
			idade = leia.nextInt();
		}while(idade >= 1);
		
		
	}
}
