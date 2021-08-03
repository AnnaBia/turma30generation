package lista1;  
import java.util.Scanner;

public class Tarefa4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.print("Informe o número A: ");
		a = ler.nextDouble();
		
		System.out.print("Informe o número B: ");
		b = ler.nextDouble();
		
		System.out.print("Informe o número C: ");
		c = ler.nextDouble();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		System.out.println("O resultado da expressão é " + d);
	}

}
