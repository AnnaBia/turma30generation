package Lista2;

import java.util.Scanner;
public class Tarefa2 {
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
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
		
		if(numero1 <= numero2 && numero1 <= numero3){
			if(numero2 <= numero3) {
				
				System.out.printf("\nA ordem �: %d %d %d", numero1, numero2, numero3);
			}
			else {
				
				System.out.printf("\nA ordem �: %d %d %d", numero1, numero3, numero2);
			}	
		} 	
		else if(numero2 <= numero1 && numero2 <= numero3){
			if(numero1 <= numero3) {
				
				System.out.printf("\nA ordem �: %d %d %d", numero2, numero1, numero3);
			}
			else {
				
				System.out.printf("\nA ordem �: %d %d %d", numero2, numero3, numero1);
			}
		} 
		else if(numero3 <= numero2 && numero3 <= numero1){
			if(numero1 <= numero2){
				
				System.out.printf("\nA ordem �: %d %d %d", numero3, numero1, numero2);
			}
			else{
			
				System.out.printf("\nA ordem �: %d %d %d", numero3, numero2, numero1);
			}
		}
	}
}
