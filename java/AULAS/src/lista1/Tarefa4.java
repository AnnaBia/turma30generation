package lista1;  
import java.util.Scanner;

public class Tarefa4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.print("Informe o n�mero A: ");
		a = ler.nextDouble();
		
		System.out.print("Informe o n�mero B: ");
		b = ler.nextDouble();
		
		System.out.print("Informe o n�mero C: ");
		c = ler.nextDouble();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		System.out.println("O resultado da express�o � " + d);
	}

}
