package entidades;

public class Gato extends Pet implements Sons{
	//atributos
	private String pelagem;
	private String pedigree;
	
	//construtor
	public Gato(String especie, String raca, char porte, String pelagem) {
	super(especie, raca, porte);
	this.pelagem = pelagem;
	}
	@Override
	public void somAlto() {
		System.out.println("MIAU MIAU MIAU...");
		
	}
	@Override
	public void somBaixo() {
		System.out.println("miau miau miau...");
		
	}
}
