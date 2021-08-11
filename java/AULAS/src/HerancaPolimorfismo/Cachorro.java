package HerancaPolimorfismo;
					//herança
public class Cachorro extends Animal{
	//construtor
	public Cachorro(String nome, int idade) {
	super(nome, idade);
						
	}
	//metodos
	public void movimento() {
		System.out.println("Corre corre corre");
	}
	public void som() {
		System.out.println("AU AU AU");
	}
}
