package br.com.lojagama.modelo;

public class Cliente {

	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;
	
	
	
	
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf + ", endereco="
				+ endereco + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
