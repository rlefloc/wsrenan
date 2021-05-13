package br.com.bankofoz.beans;

public class Poupanca extends Conta {

	private String aniversario = new String();
	private double rendimento;

	
	public void creditarRendimentos() {
		
		super.setSaldo(super.getSaldo()+rendimento);
	}
	
	public String  getDiaAnviversario () {
		if (aniversario.length() > 2) {
			return aniversario.substring(0,2);
		}
		return "aniversario invaldio";
		
	}
	
	
	@Override
	public String toString() {
		return "Poupanca [aniversario=" + aniversario + ", rendimento=" + rendimento + ", toString()="
				+ super.toString() + "]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia, String aniversario, double rendimento) {
		super(numero, saldo, cliente, agencia);
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
}
