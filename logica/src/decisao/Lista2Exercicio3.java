package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		
		double valor1 = Double.parseDouble((JOptionPane.showInputDialog
				("Digite o valor 1: ")));
		double valor2 = Double.parseDouble((JOptionPane.showInputDialog
				("Digite o valor 2: ")));
		System.out.println("SOMA (+)");
		System.out.println("SUBSTRA��O (-)");
		System.out.println("DIVIS�O (\\)");
		System.out.println("MULTIPLICA��O (*)");
		String operacao = JOptionPane.showInputDialog("Digite o simbolo da operacao que deseja:");

		if (operacao.equals("+")) {
			
			double totalOperacao = valor1 + valor2;
			System.out.println("O valor da opera��o � : " + totalOperacao);
			
		} else if (operacao.equals("-")){
			
			double totalOperacao = valor1 - valor2;
			System.out.println("O valor da opera��o � : " + totalOperacao);
			
		} else if (operacao.equals("*")) {
			
			double totalOperacao = valor1 * valor2;
			System.out.println("O valor da opera��o � : " + totalOperacao);
			
		} else if (operacao.equals("/")) {
			
			double totalOperacao = valor1 / valor2;
			System.out.println("O valor da opera��o � : " + totalOperacao);
			
		} else {
			
			System.out.println("Opera��o escolhida invalida!");
		}
	}
	
/*
 * 		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		char operacao = JOptionPane.showInputDialog
			("Digite:\n<+> Somar\n<-> Subtrair\n<*> Multiplicar\n</> Dividir").charAt(0);
		int resultado=0;
		if (operacao=='+') {
			resultado=valor1+valor2;
		}else if (operacao=='-') {
			resultado=valor1-valor2;
		}else if (operacao=='*') {
			resultado=valor1*valor2;
		}else if (operacao=='/') {
			resultado=valor1/valor2;
		}else {
			System.out.println("Op��o inv�lida");
		}
		System.out.println("Resultado: " + resultado);
 */

}
