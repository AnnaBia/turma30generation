package Lista2;

import java.util.Scanner;
public class Tarefa4 {
	/*
	 	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
    	�mpar exiba o n�mero elevado ao quadrado.
	*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um n�mero : ");
		numero = leia.nextDouble();
		
		if(numero  < 0){
			System.out.print("N�mero negativo !");
		}
		else if(numero == 0) {
			System.out.print("N�mero neutro !");
		}
		else if((numero % 2) == 0){
			System.out.print("O n�mero � par !");
			System.out.printf("\nA raiz quadrada de %.2f � %.2f !",numero,Math.sqrt(numero));
		}
		else if((numero % 2) == 1){
			System.out.print("O n�mero � �mpar !");
			System.out.printf("\nO quadrado de %.2f � %.2f !",numero,Math.pow(numero,2));
		}
		
	}
}
