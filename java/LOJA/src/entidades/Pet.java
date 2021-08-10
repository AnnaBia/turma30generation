package entidades;

public class Pet extends Animal {
	//atributos
	private String raca;
	private char porte; //P - G - M
	
	//construtor
	public Pet(String especie, String raca, char porte) {
		super(especie);
		this.raca = raca;
		this.porte = porte;
	}
}
