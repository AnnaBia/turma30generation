package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.Terceiro;
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
		char op;
		
		do {
			System.out.print("Funcionario F-funcionario ou T-terceiro:");
			char tipo= leia.next().toUpperCase().charAt(0);
			System.out.print("Digite a matricula :");
			String matricula = leia.next().toUpperCase();
			System.out.print("Digite as horas trabalhadas :");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Digite o valor por hora : R$ ");
			double valorHora = leia.nextDouble();
			if (tipo == 'T') {
				System.out.print("Digite o valor do adicional : R$");
				double adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula,horasTrabalhadas,valorHora,adicional));
			} else if(tipo == 'F') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorHora));
			}
			System.out.println("Continua S/N :");
			op = leia.next().toUpperCase().charAt(0);
					
		} while (op=='S');
		
		for (Funcionario func : folha) {
			System.out.printf("%s seu salario é R$ %.2f e o salario extra é R$ %.2f\n",func.getMatricula(),func.salario(),func.salarioExtra());
		}

	}

}
