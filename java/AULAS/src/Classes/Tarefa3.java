package Classes;

public class Tarefa3 {
	/*
	 	Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um 
	 	objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		class ProdutoEletronico
	 */

	public static void main(String[] args) {
		ProdutoEletronico celular = new ProdutoEletronico();
		celular.aparelho = "Smartphone";
		celular.marca = "Xiomi";
		celular.modelo = "Readmi Note 8";
		celular.memoria = "64gb";
		celular.cor = "Azul";
		
		
		celular.descricao();
	}

}