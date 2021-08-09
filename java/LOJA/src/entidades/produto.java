package entidades;

public class produto {
	//atributos - é, tem, estar
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//construtor possui o mesmo nome da classe
	public produto(String codigo, String nome) {
		super(); //botao direito do mouse - source - generate constructor using fields
		this.codigo = codigo;
		this.nome = nome;
	}
	public produto(String codigo, String nome, double valor, int estoque) {
		super(); //botao direito do mouse - source - generate constructor using fields
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque < 0 ) {//impede que o estoque aceite numero negativo
			this.estoque = 0;
		}
		else {
			this.estoque = estoque;
		}
	}
	//encapsulamento
	//generate get end setteres
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void incluiEstoque(int quantidade) {
		//this não é obrigatorio, pois não tem outra variavel alem dessa
		if(quantidade <= 0) {
			System.out.println("Quantidade incorreta!");
		}
		else {
			this.estoque = this.estoque + quantidade;
		}
		
	}
	public void retiraEstoque(int quantidade) {
		
		if(quantidade > estoque) {
			System.out.println("Quantidade indisponível");
		}
		else {
			this.estoque = this.estoque - quantidade;	
		}

	}
}
//extends=  
	
	
	
