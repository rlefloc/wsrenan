package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: sao os tipos que estao dentro da linguagem
		 * 
		 * boolean = tipo logico (true/false)
		 * char = 1 caracter (apostrofos) 'a' (char) // "a" (string)
		 * 
		 * byte = -127/+128
		 * short = -32mil / +32mil
		 * int = - 9 trilhoes / + 9 trilhoes
		 * long = quintilhoes
		 * float = 
		 * double possui o dobro de precisao em relacao ao float
		 * 
		 */
		
		
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = salario * (float) 0.08; //ocorre o casting
		int numero = 5;
		byte resultado = (byte) (numero +2); //ocorre o casting
		
		
		/*
		 * Classes Wrappers (sao classes que servem para apoiar os tipos primitivos)
		 * int => Integer
		 * float => Float
		 * boolean => Boolean
		 * double => Double
		 */
		
		
	}
}
