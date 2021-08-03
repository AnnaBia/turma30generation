package lista1;  
import java.util.Locale;
import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double custoFinal, custoFabrica, taxaVenda, imposto, porcento, taxaGoverno;
		
		imposto = 0.45;
		porcento = 0.28;
		
		System.out.print("Informe o preço de fábrica R$ ");
		custoFabrica = ler.nextDouble();
		
		taxaVenda = custoFabrica * 0.28;
		taxaGoverno = custoFabrica * 0.45;
		
		custoFinal = custoFabrica + taxaVenda + taxaGoverno;
	
		System.out.println("O preço para consumidor será R$ " + Math.round(custoFinal));
		
		
		
	}
}
