package Lista9.Classes;

public class Estoque {
	private String codigo;
	private String profuto;
	private int estoque;
	public Estoque(String codigo, String profuto, int estoque) {
		super();
		this.codigo = codigo;
		this.profuto = profuto;
		this.estoque = estoque;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfuto() {
		return profuto;
	}
	public void setProfuto(String profuto) {
		this.profuto = profuto;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
