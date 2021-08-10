package Heranca;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, boolean emitirSom) {
		super(nome, idade, emitirSom);
		
	}
	public void subir() {
		System.out.println("Subindo em árvores ...");
	}

}
