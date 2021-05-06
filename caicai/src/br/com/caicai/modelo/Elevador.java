package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int andarAtual=0;
	private int qtdePessoas=0;
	
	
//Inputs
	//Input de tudo sobre o elevador
	public void inicializar (String pNome, int pAndarMax, int pAndarMin, int capPessoas) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = capPessoas;

	}
	
	
	//Input subir
	public String subir() {
		if (andarAtual < andarMaximo) {
			andarAtual++;
			return "Subindo para o andar " + andarAtual;
		} else {
		    return "NAo pode subir, esta no andar" + andarAtual;
		}
	}
	
	
	//Input descer
	public String descer() {
		if (andarAtual > andarMinimo) {
			andarAtual--;
			return "Descendo para o andar " + andarAtual;
		} else {
			return "NAo pode descer, esta no andar" + andarAtual;
		}
	}
	
	
	//Input entrar
	public void entrar() {
		if (qtdePessoas < capacidadePessoas) {
			qtdePessoas++;
		} else {
			return;
		}
	}
	

	//Input sair
	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas--;
		} 
	}
	
	
	//Input entrar(pQtde)
	public void entrar(int pQtde) {
		int resultado = pQtde + qtdePessoas;
		if (resultado <= capacidadePessoas) {
			qtdePessoas+=pQtde;
		} 
	}
	
	
	
//Retornos
	
	//Retorno de tudo sobre o elevador
	public String retornarTudo () 	{
		return "Nome do Elevador: " + nome + "\n" +
			   "Maximo de andares :" + andarMaximo + "\n" +
			   "Minimo de andares: " + andarMinimo + "\n" +
			   "Capacidade de pessoas: " + capacidadePessoas + "\n" +
			   "Quantidade de pessoas: " + qtdePessoas + "\n" +
			   "Andar Atual " + andarAtual;
	}
	
	
}
