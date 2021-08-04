package aulasVideo7;

import java.util.*;

public class Condicional1{
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade : ");
		idade = ler.nextInt();
		ler.nextLine();//limpar o banfer de memória;
		System.out.printf("Entre com o seu nome : ");
		nome = ler.nextLine(); //String usa nextLine
		System.out.printf("\nSeu nome %s ",nome);//%s pega uma variavel do tipo String
		System.out.printf("\nSua idade : %d",idade);//%d representa número inteiro
		
		if(idade >= 18) {
			
			System.out.printf("Você é maior de idade !");
		}
		else if(idade >= 1 && idade < 18){
			
			System.out.printf("\nVocê é menor de idade ... ");
		}
		
		else {
			
			System.out.printf("\nVocê entrou com uma idade inválida ...");
		}
		
		
		
	}
}