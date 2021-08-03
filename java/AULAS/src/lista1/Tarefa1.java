package lista1;
import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int totalAno;
		int totalMes;
		int idade;
		int ano;
		int mes;
		int dia;
		
		System.out.println("Informe sua idade  ");
		
		
		System.out.print("anos : ");
		ano = ler.nextInt();
		
		System.out.print("meses : ");
		mes = ler.nextInt();
		
		System.out.print("dias : ");
		dia = ler.nextInt();
		
		totalAno = ano*365;
		totalMes = mes*30;
		idade = totalAno+totalMes+dia;
		
		System.out.print("Sua idade em dias é "+ idade);
	}

}