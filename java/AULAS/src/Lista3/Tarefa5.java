package Lista3;

import java.util.Scanner;

public class Tarefa5 {
		/*
		 	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
	
	
		public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			int numero,soma = 0;
			
			do {
				System.out.print("Digite um n�mero: ");
				numero = read.nextInt();

				soma += numero;
			} while(numero != 0);

			System.out.printf("/nSoma: %d", soma);
			read.close();
	}
		
}