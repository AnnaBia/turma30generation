package aulasVideo7;

import java.util.Scanner;

public class Repeticao2 {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com a sua idade : ");
		idade = leia.nextInt();
		
		while(idade >= 1) {
			
			System.out.printf("\nSua idade : %d anos",idade);
			
			if(idade >= 18) {
				System.out.printf("\nVoc� � de maior ...");
			}
			else {
				System.out.printf("\nVoc� � de menor ...");
			
			}
			System.out.printf("\n\nEntre com a sua idade : ");
			idade = leia.nextInt();
		}
	}

}
