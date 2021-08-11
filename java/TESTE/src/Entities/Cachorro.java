package Entities;

public class Cachorro extends Pet{

	public Cachorro(String raca, int anoNascimento) {
		super(raca, anoNascimento);
	}

	private boolean latidoAlto;

	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	@Override
	public void emiteSom() {
		if(latidoAlto) {
			System.out.println("MIAU MIAU MIAU ...");
		}
		else {
			System.out.println("miau miau miau ...");
		}
	}
	
}
