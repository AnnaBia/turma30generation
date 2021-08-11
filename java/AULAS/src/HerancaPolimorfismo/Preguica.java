package HerancaPolimorfismo;
					//herança
public class Preguica extends Animal {
	//construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	//metodo
	public void movimento() {
		System.out.println("Sobe árvores");
	}
	public void som() {
		System.out.println("zzzzzZZZ");
	}

}
