import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[] args){
											
		Scanner leia = new Scanner(System.in);//criar um teclado
		String nome; //string = noome(portugol)
		int anoNascimento;
		int idade;
		
		
		
		System.out.println("Digite o nome : ");
		//print = n�o pula linha
		//println = pula linha
		nome = leia.nextLine();
		//leia.next = l� s� o primeiro nome
		//leia.nextLine == para sprint
							
		System.out.println("Digite o ano de nascimento : ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		
		System.out.println("Oi " + nome + " sua idade � " + idade + " anos!!!");
		
		
		
		
		
	}
}
