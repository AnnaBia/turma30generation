package Classes;

public class Tarefa4 {
	public static void main(String args[]) {
		
		/*
		 	Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida 
		 	crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste 
		 	objeto no console.
		 */
		Funcionario contratado = new Funcionario();
		contratado.matricula = 2612;
		contratado.nome = "Ana Bia";
		contratado.departamento = "Desenvolvedora Junior";
		contratado.email = "bia_espejo@hotmail.com";
		contratado.status = "ativo";
		
		System.out.println("MATRICULA\tNOME\t\tDEPARTAMENTO\t\tE-mail\t\t\tSTATUS");
		contratado.Funcionario();	
	}
}
