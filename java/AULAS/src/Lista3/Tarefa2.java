package Lista3;

import java.util.Scanner;

public class Tarefa2 {
	/*
	 	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=0,contador,par=0,impar= 0,negativo=0;
		
		
		for(contador = 1;contador <= 10; contador++) {
			System.out.printf("Número %d: ",contador);
			numero = leia.nextInt();
			
			if(numero <= 0){
				System.out.print("Número inválido, digite outro.\n");
				contador--;
			}
			else if((numero%2)==0){
				par++;
			}
			else if((numero%2)==1){
				impar++;
			}

		}
			System.out.printf("\nNúmeros pares : %d",par);
			System.out.printf("\nNúmero ímpares : %d",impar);
	}

}
