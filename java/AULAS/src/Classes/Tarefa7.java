package Classes;

public class Tarefa7 {
	/*
		 Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe, em 
		 seguida crie um objeto paciente, defina as instancias deste objeto e apresente as 
		 informa��es deste objeto no console.
	 */
	public static void main(String[] args) {
		Paciente status = new Paciente();
		status.nome = "Maria";
		status.cpf = "123.321.123-12";
		status.idade = 20;
		status.situacao = "Muita fadiga";
		status.causa = "Excesso de estudos";
		
		System.out.println("Informa��es Paciente");
		status.Informacoes();
	}

}
