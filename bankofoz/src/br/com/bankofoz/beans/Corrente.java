package br.com.bankofoz.beans;

public class Corrente extends Conta{

	private double limite;
	private double taxa;
	
	public void debitarTaxa() {
		
		super.setSaldo(super.getSaldo()-taxa);
		
	}
	
	
	public void sacar(double valor) {
		
		if ((limite + super.getSaldo())>=valor) {
			
		}
		
	}
	
	public double getSaldo() {
		return limite+super.getSaldo();
	}
	
	public Corrente() {
		super();
	}
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente(double limite, double taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
	
}
