package Lista9.Classes;
	//herança
public class Cavalo extends Animal {
	//construtor
	public Cavalo(String nome, int idade) {
	super(nome, idade);
	}
	//metodo
	public void movimento() {
	System.out.println("POTOCÓ POTOCÓ POTOCÓ");
	}
	public void som() {
	System.out.println("Hiin in in");
	}
}