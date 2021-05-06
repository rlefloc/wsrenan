package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {

		String pessoaVelha = "";
		int idadeVelha = 0;
		String pessoaNova = "";
		int idadeNova = 99;
		int contM = 0;
		int qtdePessoas = 0;
		float media = 0;
		int totalIdade = 0;

		do {

			String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

			
			if (idade >= 18) {
				contM++;
			}
			if (idade < idadeNova) {
				idadeNova = idade;
				pessoaNova = nome;
			} else if (idade > idadeVelha) {
				idadeVelha = idade;
				pessoaVelha = nome;
			}
			
			qtdePessoas++;
			totalIdade = totalIdade + idade;
			media = totalIdade / qtdePessoas;

		} while((JOptionPane.showConfirmDialog(null, "Deseja continuar o input de dados?", 
				"Titulo", JOptionPane.YES_NO_OPTION)==0));


		JOptionPane.showMessageDialog(null, "O usuario " + pessoaNova + " é o mais novo com " + 
				idadeNova + "anos.\nO usuario " + pessoaVelha + " é o mais velho com " +
				idadeVelha + "anos.\nTemos " + contM + " usuarios acima de 18 anos.\nA media "
						+ "das idades é de " + media);

	}


}

