package Lista2;

import java.util.Scanner;
public class Tarefa1 {
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Digite o primeiro número : ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número : ");
		numero2 = leia.nextInt();
		
		System.out.print("Digite o terceiro número : ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.print("\nO maior número é " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3){
			System.out.print("\nO maior número é " + numero2);
		}
		else{
			System.out.print("\nO maior número é " + numero3);
		}
	}
}
