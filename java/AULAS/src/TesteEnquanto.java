import java.util.Scanner;

public class TesteEnquanto {

	public static void main(String[] args) {
		/*
		 	precisa do nome e do salario,
			informar o nome e salario da pessoa que tem maios salário,
			o programa termina quando o valor for digitado 1 valor negativo ou 0 .
		*/
		Scanner leia = new Scanner(System.in);
		String nome = "";
		int salario = 0 ;
		int maiorSalario = 0;
		String nomeMaiorSalario = "";
		
		System.out.print("Digite o nome : ");
		nome = leia.next();
		
		System.out.print("Digite o salário : ");
		salario = leia.nextInt();
		
		while(salario > 0) {
			
			if(salario > maiorSalario);{
					maiorSalario = salario;
					nomeMaiorSalario = nome;
				
					System.out.print("Digite o nome : ");
					nome = leia.next();
					
					System.out.print("Digite o salário : ");
					salario = leia.nextInt();
			}
		}
		
		
		
		
	}

}
