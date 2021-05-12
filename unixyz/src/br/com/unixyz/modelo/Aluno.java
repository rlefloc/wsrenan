package br.com.unixyz.modelo;

/*
 * Design Pattern: compilado de padros de projetos para Orientacao de Objetos (OO)
 * Um dos padoes eh o DTO (Data transfer object) cuja funcao eh aplicar boa pratica na transicao
 * entre o projeto e a programacao.
 * 
 * 1 - todos atributos devem estar como privados
 * 2 - cada atributo deve possuir um metodo para input (set) e outro mtodo para output (get)
 * 3 - no MINIMO dois construtores, sendo um vazio e outro com todos 
 * 
 * 
 */


public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;

	
	
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Aluno() {

	}


	public Endereco getEndereco() {
		return endereco;
	}


	


	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf
				+ ", endereco=" + endereco + "]";
	}


	public Aluno(int rm, String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	public Aluno (int rm) {
		this.rm = rm;
	}

	public Aluno (int rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}



	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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


	public void setBasico(String nome, int rm) {
		this.nome = nome;
		this.rm = rm;
	}




	public String getResumo() {
		return "Nome: " + nome + "\n" +
				"RM: " + rm;
	}


	public String getUsuario() {
		if (email.contains("@")) {
			return ("Usuario: " + email.substring(0, email.indexOf("@")).toUpperCase());
		}
		return email;
	}




}
