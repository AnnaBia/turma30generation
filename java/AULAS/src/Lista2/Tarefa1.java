package Lista2;

import java.util.Scanner;
public class Tarefa1 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Digite o primeiro n�mero : ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo n�mero : ");
		numero2 = leia.nextInt();
		
		System.out.print("Digite o terceiro n�mero : ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.print("\nO maior n�mero � " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3){
			System.out.print("\nO maior n�mero � " + numero2);
		}
		else{
			System.out.print("\nO maior n�mero � " + numero3);
		}
	}
}
