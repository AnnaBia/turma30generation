
import java.util.Scanner;

public class DesafioIR {

	/*
	NOME DO CONTRBUINTE
	FORMA QUE DESEJA SER TRATADO - ELE, ELA, ELLU
	PERGUNTA O SALARIO BRUTO EM REAIS
	ISENTO/ISENTA/ISENTE - SALARIO <=2000

	SALARIO ACIMA DE  2000 E ABAIXO 5000 PAGA IMPOSTO DE 15%

	ACIMA DE 5000 PAGA 25%
	VALOR DO IMPOSTO E SALARIO BRUTO APÓS IMPOSTO

	 */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		char genero;
		double salarioBruto;
		double imposto;
		double salarioLiquido;
		String saudacao = "";

		System.out.print("Digite seu nome : ");
		nome = leia.nextLine();
		System.out.print("Como deseja ser tratado (M - masculino, F - feminino, E - ellu) : ");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite seu salário : ");
		salarioBruto = leia.nextDouble();
		
		if(genero == 'M'){
			
			saudacao = "Sr.";
			
		} else if(genero == 'F'){
			
			saudacao = "Sra.";
			
		} else if(genero == 'E') {
			
			saudacao = "Sre.";
			
		}
		
		if(salarioBruto <= 0){
			
			System.out.println("Salário inválido");
			
		} else if(salarioBruto <= 2000){
			
			System.out.printf("%s %s, isento de impostos.",saudacao,nome);
			
		} else if(salarioBruto <= 5000){
			imposto = salarioBruto * 0.15;
			salarioLiquido = salarioBruto*0.85;

			System.out.printf("\nValor do imposto: %.2f" ,imposto);
			System.out.printf("\n%s %s, salário com imposto : %.2f",saudacao,nome,salarioLiquido);
		
		} else {
			imposto = salarioBruto * 0.25;
			salarioLiquido = salarioBruto*0.75;
			
			System.out.printf("\nValor do imposto: %.2f" ,imposto);
			System.out.printf("\n%s, salário com imposto : %.2f",saudacao,nome,salarioLiquido);
		
		}
	}
}	

