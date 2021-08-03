package lista1;  
import java.util.Scanner;

public class Tarefa5 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1/2) + (nota2/3) + (nota3/5);
		
		System.out.print("Média final: " + Math. round(media));
		
	}

}
