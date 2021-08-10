package entidades;

public class AnimalCivilizado extends Animal {
	//atributos
	private String raca;
	private char porte; //P - G - M
	private boolean cercado;
	private boolean vacinado;
	
	//construtor
	public AnimalCivilizado(String especie, String raca, char porte) {
	super(especie);
	this.raca = raca;
	this.porte = porte;
	}
}
