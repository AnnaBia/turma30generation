package Heranca;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, boolean emitirSom) {
		super(nome, idade, emitirSom);
		
	}
	public void correr() {
		System.out.println("Correndo ...");
	}
}
