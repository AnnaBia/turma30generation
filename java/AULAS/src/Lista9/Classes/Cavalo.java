package Lista9.Classes;
	//heran�a
public class Cavalo extends Animal {
	//construtor
	public Cavalo(String nome, int idade) {
	super(nome, idade);
	}
	//metodo
	public void movimento() {
	System.out.println("POTOC� POTOC� POTOC�");
	}
	public void som() {
	System.out.println("Hiin in in");
	}
}