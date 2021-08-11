package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import Entities.Funcionario;
import Entities.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		//locale é uma classe - para dizer que é padrao americano, não é obrigatorio
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
								//não esquecer do Array p/criar lista
		List<Funcionario> folha = new ArrayList<>();
		char tipo;
		char op;
		do {
			System.out.println("funcionario normal ou terceiro ");
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.println("digite a matricula : ");
			String matricula = leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas : ");
			int horastrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora : R$");
			double valorHora = leia.nextDouble();
			
			if(tipo == 'T') {
				System.out.println("Digite o valor do adicional : R$");
				double adicional = leia.nextDouble();
				//como enviar para lista
				folha.add(new Terceiro(matricula,horastrabalhadas,valorHora,adicional));
			}
			else if(tipo == 'F') {
				folha.add(new Funcionario(matricula,horastrabalhadas,valorHora,adicional));
			}
			System.out.println("Continua [S/N] : ");
			op = leia.next().toUpperCase().charAt(0);
		}while(true);
		
		for(Funcionario func : folha) {
			//System.out.printf("%s seu salario é R$ %.2f", func.);
		}
	}

}
