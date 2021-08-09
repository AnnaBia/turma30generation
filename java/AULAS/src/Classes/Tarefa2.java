package Classes;

public class Tarefa2 {
	/*
	 	Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie
	 	um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		class Aviao
	 */

	public static void main(String[] args) {
		
	Aviao voo = new Aviao();
	voo.voo = "A-234";
	voo.agencia = "Azul";
	voo.origem = "São Paulo - Guarulhos (GRU)";
	voo.destino = "Juazeiro do Norte (JDO)";
	
	System.out.println("VOO\tAGENCIA\t  ORIGEM\t\t\tDESTINO");
	voo.Informacoes();
	}

}