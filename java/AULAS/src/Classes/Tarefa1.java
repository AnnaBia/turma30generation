package Classes;

public class Tarefa1 {
	/*
	 	Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		
		
		class Cliente
	 */
	public static void main(String[] args) {
	
	Cliente cliente = new Cliente();
	cliente.senha = "010";
	cliente.nome = "Ana B";
	cliente.status = "Em andamento";
	
	System.out.println("SENHA\tNOME\tSTATUS");
	cliente.Dados();
	}

}