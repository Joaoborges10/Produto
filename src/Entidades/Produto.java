package Entidades;

public class Produto {
	private String nome;
	private double preco;
	
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String etiqueta() {
		return nome 
				+ " R$ " 
				+ String.format("%.2f", preco);
	}
}