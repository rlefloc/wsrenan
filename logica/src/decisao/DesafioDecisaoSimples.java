package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Pedir: nome e idade
		 * de acordo com as regras para votacao no Brasil
		 * oriente o usuario se ele pode votar, se ele nao pode votar ou se
		 * o voto dele eh facultativo
		 *  >70 facultativo
		 *  
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		short idade = Short.parseShort(JOptionPane.showInputDialog ("Digite sua idade: "));
		
		
		if (idade > 17 && idade < 70) {
			
			System.out.println(nome + "\nVoc� j� deve votar!");
		
		}
		
		if ((idade > 70) || (idade >= 16 && idade <= 17)) {
			
			System.out.println(nome + "\nSeu voto � facultativo!");
		
		}
		
	
//		if (idade >= 16 && idade <= 17) {
			
//			System.out.println(nome + "\nSeu voto � facultativo!");
	
//		}

		
		if (idade < 16 ) {
			
			System.out.println("\nVoc� ainda n�o pode votar!");
		
		}
		
	}

}
