package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	public static void main(String[] args) {

		/*
		 * Capturar:
		 * - nome da disciplina
		 * - primeira nota
		 * - segunda nota
		 * - calcular media
		 * - exibir media
		 */
		
		String disciplina = JOptionPane.showInputDialog("Digite Nome da Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Primeira Nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda Nota: "));
		float media = ((nota1 + nota2)/2);
		
		//&& => and           || => or
		/*
		 * "Voce foi reprovado" => media menor que 4
		 * "Voce tem chance no exame" => media entre 5.9 e 4
		 */
		
		
		if (media >= 6) {
			//somente vai ser executado se a condicao for verdadeira
			System.out.println("Voce foi aprovado na disciplina " + disciplina);
			
		}
		
		else if (media < 4) {
			//somente vai ser executado se a condicao for verdadeira
			System.out.println("Voce foi reprovado na disciplina " + disciplina);
			
		}
		
		else  {
			//somente vai ser executado se a condicao for verdadeira
			System.out.println("Voce tem chance no exame da disciplina " + disciplina);
			
		}
		
		
		System.out.println("Sua media na materia " + disciplina + " eh: " + media);
		
	}
}
