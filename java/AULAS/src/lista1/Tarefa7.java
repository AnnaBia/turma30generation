package lista1;  
import java.util.Scanner;

public class Tarefa7 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Informe os valores de: ");
		System.out.print("a: ");
		a = ler.nextDouble();
		System.out.print("b: ");
		b = ler.nextDouble();
		System.out.print("c: ");
		c = ler.nextDouble();
		System.out.print("d: ");
		d = ler.nextDouble();
		System.out.print("e: ");
		e = ler.nextDouble();
		System.out.print("f: ");
		f = ler.nextDouble();
		
		x = Math.round((c*e - b*f)/(a*e - b*d));
		y = Math.round((a*f - c*d)/(a*e - b*d));
		
		System.out.print("Valor de x: " + x + "\\nValor de y: "+y);
	}

}