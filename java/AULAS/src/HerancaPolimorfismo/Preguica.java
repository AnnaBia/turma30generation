package HerancaPolimorfismo;
					//heran�a
public class Preguica extends Animal {
	//construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	//metodo
	public void movimento() {
		System.out.println("Sobe �rvores");
	}
	public void som() {
		System.out.println("zzzzzZZZ");
	}

}
