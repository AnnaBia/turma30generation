package Classes;

public class Tarefa6 {
	/*
	 	Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
	 	em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente 
	 	as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		ContaBancaria deposito = new ContaBancaria();
		deposito.banco = "Nubank";
		deposito.operacao = 231;
		deposito.agencia = 0123;
		deposito.conta = 0123456;
		deposito.digito = 6;
		deposito.valor = 700.00;
		
		System.out.println("Dados depósito");
		deposito.Dados();

	}

}
