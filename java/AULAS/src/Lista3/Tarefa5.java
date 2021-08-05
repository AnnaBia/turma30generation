package Lista3;

import java.util.Scanner;

public class Tarefa5 {
		/*
		 	Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
	
	
		public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			int numero,soma = 0;
			
			do {
				System.out.print("Digite um número: ");
				numero = read.nextInt();

				soma += numero;
			} while(numero != 0);

			System.out.printf("/nSoma: %d", soma);
			read.close();
	}
		
}