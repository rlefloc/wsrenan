package br.com.unixyz.modelo;

public class Professor {
	
	private String endereco;
	private String nome;
	private String titulacao;
	private double valorHora;
	
	
	
	
	
	
	public Professor() {
		super();
	}



	public Professor(String endereco, String nome, String titulacao, double valorHora) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.titulacao = titulacao;
		this.valorHora = valorHora;
	}
	
	
	
	@Override
	public String toString() {
		return "Professor [endereco=" + endereco + ", nome=" + nome + ", titulacao=" + titulacao + ", valorHora="
				+ valorHora + "]";
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}
