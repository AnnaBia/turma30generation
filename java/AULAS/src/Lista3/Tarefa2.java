package Lista3;

import java.util.Scanner;

public class Tarefa2 {
	/*
	 	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=0,contador,par=0,impar= 0,negativo=0;
		
		
		for(contador = 1;contador <= 10; contador++) {
			System.out.printf("N�mero %d: ",contador);
			numero = leia.nextInt();
			
			if(numero <= 0){
				System.out.print("N�mero inv�lido, digite outro.\n");
				contador--;
			}
			else if((numero%2)==0){
				par++;
			}
			else if((numero%2)==1){
				impar++;
			}

		}
			System.out.printf("\nN�meros pares : %d",par);
			System.out.printf("\nN�mero �mpares : %d",impar);
	}

}
