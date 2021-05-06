package br.com.rubinhocar.modelo;

public class Veiculo {

	private float valor;
	private String modelo;
	private String montadora;
	
	//<modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>)
	

	public void preencherModelo (String param) {
		if (param.length() <= 40) {
			modelo = param.toUpperCase();
		}
	}
	
	public String retonarModelo () {
		return modelo;
	}
	
	
	public void preencherValor (float param) {
		valor = param;
	}
	
	public float retornarValor () {
		return valor;
	}
	
	
	public void preencherMontadora (String param) {
		if (param.length() <=30) {
			montadora = param.toUpperCase();
		}
	}
	
	
	public String retornarMontadora () {
		return montadora;
	}

	
	
	
	public void preencherTudo (float pValor, String pModelo, String pMontadora) {
		valor = pValor;
		modelo = pModelo;
		montadora = pMontadora;
	}
	
	
	
	public String retornarTudo () 	{
		return "Modelo: " + modelo + "\n" +
			   "Montadora :" + montadora + "\n" +
				"Valor: " + valor;
	}
	
	
	
	public float retornarDesconto () {
		return valor * (float) 0.9;		
	}
	
	
}
