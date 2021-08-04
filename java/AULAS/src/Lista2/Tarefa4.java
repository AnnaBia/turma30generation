package Lista2;

import java.util.Scanner;
public class Tarefa4 {
	/*
	 	Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    	ímpar exiba o número elevado ao quadrado.
	*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um número : ");
		numero = leia.nextDouble();
		
		if(numero  < 0){
			System.out.print("Número negativo !");
		}
		else if(numero == 0) {
			System.out.print("Número neutro !");
		}
		else if((numero % 2) == 0){
			System.out.print("O número é par !");
			System.out.printf("\nA raiz quadrada de %.2f é %.2f !",numero,Math.sqrt(numero));
		}
		else if((numero % 2) == 1){
			System.out.print("O número é ímpar !");
			System.out.printf("\nO quadrado de %.2f é %.2f !",numero,Math.pow(numero,2));
		}
		
	}
}
