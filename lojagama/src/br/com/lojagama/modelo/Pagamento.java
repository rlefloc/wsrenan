package br.com.lojagama.modelo;

public class Pagamento {
	
	
	private double valor;
	private String forma;
	private String data;
	
	
	public String getDia() {
		return "Data de pagamento: " + data.substring(0,2);
	}
	
	
	
	
	public Pagamento() {
		super();
	}
	public Pagamento(double valor, String forma, String data) {
		super();
		this.valor = valor;
		this.forma = forma;
		this.data = data;
	}
	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + ", forma=" + forma + ", data=" + data + "]";
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	
	

}
