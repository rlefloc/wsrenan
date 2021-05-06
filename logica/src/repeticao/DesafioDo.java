package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * O Jogador1 ira digitar um numero
		 * Cabera ao Jogar2 descobrir qual foi o numero digitado pelo Jogador1
		 * 
		 * Primeira missao:
		 * - fazer com que a aplicacao pergunte o numero para o Jogador2 
		 * enquanto ele nao acertar o numero, e quando acertar exibir a mensagem Parabens
		 * 
		 * Segunda Missao:
		 * - apos jogador2 chutar o numero deve exibir para ele uma dica,
		 * informando se o numero digitado pelo Jogardor1 é maior ou menor que
		 * o numero que ele digitou
		 * 
		 * Terceira missao:
		 * - quando o jogador2 acertar, junto a msg de parabens devera exibir
		 * quantas tentativas ele utilizou ateh acertar o numero
		 * (dica: tera que utilizar uma variavel para contar)
		 * 
		 */

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 digite o valor: "));
		int valor2;
		int tentativas = 0;

		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog
					("Jogador2, digite o valor que acha que foi digitado pelo Jogador1: "));
			if (valor2 < valor1) {
				System.out.println("Dica: O Numero é maior que o digitado");
				tentativas++;
			} else if (valor2 > valor1) {
				System.out.println("Dica: O Numero é menor que o digitado");
				tentativas++;
			} else {
				tentativas++;
				JOptionPane.showMessageDialog(null, "Parabens, voce acertou com " + tentativas);
			}
			
		} while ((valor2 != valor1) && 
				(JOptionPane.showConfirmDialog(null, "Numero incorreto, deseja continuar?", 
						"Titulo", JOptionPane.YES_NO_OPTION)==0));
	}

}
