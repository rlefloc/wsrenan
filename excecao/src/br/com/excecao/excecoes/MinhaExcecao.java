package br.com.excecao.excecoes;

public class MinhaExcecao extends Exception {

	public static String tratar (Exception e) {
		if (e instanceof NullPointerException) {
			return "objeto nulo";
		}else if (e instanceof NumberFormatException) {
			return "numero invalido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "vetor estourou";
		}else {
			return "Erro? Vai saber la eu, chame o estagiario";
		}
	}
	
	
}
