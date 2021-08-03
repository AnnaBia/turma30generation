package lista1;
import java.util.Scanner;

public class Tarefa3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos, seg;
		
		System.out.print("Informe o tempo de duração do evento em segundos : ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		seg = (segundos%3600)%3600;
		
		System.out.println("O tempo de duração do evento é de " + horas + "h : " + minutos + "min :" + seg + "s.");
	}

}