package br.com.urnaeletronica.beans;

public class Voto {

	private int titulo;
	private String cnadidato;
	private String cargo;
	private byte turno;
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public String getCnadidato() {
		return cnadidato;
	}
	public void setCnadidato(String cnadidato) {
		this.cnadidato = cnadidato;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public byte getTurno() {
		return turno;
	}
	public void setTurno(byte turno) {
		this.turno = turno;
	}
	public Voto(int titulo, String cnadidato, String cargo, byte turno) {
		super();
		this.titulo = titulo;
		this.cnadidato = cnadidato;
		this.cargo = cargo;
		this.turno = turno;
	}
	public Voto() {
		super();
	}
	@Override
	public String toString() {
		return "Voto [titulo=" + titulo + ", cnadidato=" + cnadidato + ", cargo=" + cargo + ", turno=" + turno + "]";
	}
	
	
}
