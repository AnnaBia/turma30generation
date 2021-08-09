package programas;

import entidades.produto;

public class CadLoja {

	public static void main(String[] args) {
		produto prod1 = new produto("001","CAMISETA");
		produto prod2 = new produto("002","CALÇA",100.50,-1);
		
		//prod1.setNome("CAMISETA");

		
		//System.out.println(prod2.getValor()*2);
		//System.out.println(prod2.getEstoque());
		
		prod2.retiraEstoque(5);
		prod1.incluiEstoque(-1);
		prod1.retiraEstoque(1);
		System.out.println(prod1.getEstoque());
		System.out.println(prod2.getEstoque());
		
		

	}

}
