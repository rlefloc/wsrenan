package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		 * Sintaxe do for eh formada pro 3 parametros
		 * - variavel que vai contar e o valor que vai iniciar
		 * - condicao ateh quando o loco vai ser repetido
		 * - a forma de contagem (se vai ser 1 a 1, ou etc.)
		 */
		
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for(int cont=1; cont<11; cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
	}
}
