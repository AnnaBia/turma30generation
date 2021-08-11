package Entities;

public class Ave extends Pet{
	
	public Ave(String raca, int anoNascimento) {
		//super chama o atributo
		super(raca, anoNascimento);
	}
	private boolean voa;
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}
	public boolean isVoa() {
		return voa;
	}
	public void setVoa(boolean voa) {
		this.voa = voa;
	}
}
