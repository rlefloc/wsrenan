package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "rLeFloc@gmail.com";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("MAiusculo: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posicao do @: " + email.indexOf("@"));
		System.out.println("Do 3 ate o 5: " + email.substring(2,5));
		System.out.println("Do 3 ate o fim: " + email.substring(2));
		System.out.println("Primeira MEtade: " + email.substring(0, email.length()/2));
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Primeiro Caracter: " + email.charAt(0));
	
		
		System.out.println("� igual? " + email.equals("rLeFloc@gmail.com"));
		
		/*
		 * churros => variavel
		 * churros() => funcao
		 * Abc.churros() => metodos
		 * Churros => classe
		 */
		
		
	}
	
}
