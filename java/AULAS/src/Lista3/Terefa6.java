package Lista3;

import java.util.Scanner;

public class Terefa6 {
	/*
	 	Escrever um programa que receba vários números inteiros no teclado. 
	 	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	 */
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero,contador=0;
		double soma=0, media;
		

		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();

			if(numero != 0 && numero%3 ==0 ) {
				soma += numero;
				contador++;
			}

		} while(numero!=0);

		media = soma/contador;

		System.out.printf("\nMédia dos múltipos de 3: %.2f", media);
		leia.close();
	}
}
