package Classes;

public class Tarefa2 {
	/*
	 	Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie
	 	um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		class Aviao
	 */

	public static void main(String[] args) {
		
	Aviao voo = new Aviao();
	voo.voo = "A-234";
	voo.agencia = "Azul";
	voo.origem = "S�o Paulo - Guarulhos (GRU)";
	voo.destino = "Juazeiro do Norte (JDO)";
	
	System.out.println("VOO\tAGENCIA\t  ORIGEM\t\t\tDESTINO");
	voo.Informacoes();
	}

}