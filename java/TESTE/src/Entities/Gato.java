package Entities;

public class Gato extends Pet implements Sons{
	
	public Gato(String raca, int anoNascimento) {
		super(raca, anoNascimento);
	}

	private boolean miadoAlto;

	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	

	@Override
	public void somAlto() {
		System.out.println("MIAU MIAU MIAU ...");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("miau miau miau ...");
		
	}
	

	
	

	
	
}
