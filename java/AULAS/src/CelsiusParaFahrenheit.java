import java.util.Locale;
import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double temperaturaC;
		double temperaturaF;
		
		System.out.print("Informe a temperatura em Celsius : ");
		temperaturaC = leia.nextDouble();
		
		temperaturaF = (temperaturaC * 1.8) + 32;
		
		System.out.println("A temperatura em fahrenheit : " + temperaturaF);
		
		leia.close();
	}
}
