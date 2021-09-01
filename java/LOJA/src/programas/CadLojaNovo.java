package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//ex Lista de nomes
		//não é possivel usar uma "List" de novo, pois é uma interface
		List<String> cadastro = new ArrayList<>();
		int x=0;
		Integer y=0;
		double salario;
		String auxNome;
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTS");
		
		System.out.println("Tamanho da lista : " + cadastro.size());
		
		
		System.out.println(cadastro.get(4));
		
		//como tirar um time da lista pelo nome
		auxNome = leia.next().toUpperCase();
		x=cadastro.indexOf(auxNome);
		
		
		//como tirar um time da da lista
		System.out.println("Vc escolheu o time " + cadastro.get(x) + " este time será retirado da lista !");
		cadastro.remove(x);
		System.out.println("NOVA LISTA !!!");
		
		x=0;
		for(String time: cadastro) {
			System.out.println(cadastro.indexOf(time)+ " - " + time);
			x++;
		}
		
		//adiciona algo a lista -- o numero 1 denomina a posição em que aparecerá
		cadastro.add(1,"GAUARANI");
		
		System.out.println();
		//foR EACH
		//mostra a tabela toda
		for(String time : cadastro) {
			//toLowerCase() - transforma a palavra em minusculo
			System.out.println(time);
		}
	}

}
