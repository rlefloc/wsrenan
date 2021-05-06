package repeticao;

import javax.swing.JOptionPane;

public class Lista3Exercicio1 {

	public static void main(String[] args) {

		int sexoMcomExp = 0;
		int sexoMsemExp = 0;
		int sexoFcomExp = 0;
		int sexoFsemExp = 0; 

		do {

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
			char sexo = JOptionPane.showInputDialog
					("Digite seu sexo:\n<M> Masculino\n<F> Feminino").charAt(0);
			
			while (sexo!='M' && sexo!='F') {
				sexo = JOptionPane.showInputDialog
						("Opção invalida!\n"
								+ "Digite seu sexo:\n<M> Masculino\n<F> Feminino").charAt(0);
			}
			
			
			char exp = JOptionPane.showInputDialog
					("Digite se possui experiencia:\n<S> Sim\n<N> Nao").charAt(0);
			
			while (exp!='S' && exp!='N') {
				exp = JOptionPane.showInputDialog
						("Opção invalida!\n"
								+ "Digite se possui experiencia:\\n<S> Sim\\n<N> Nao").charAt(0);
			}
			
			
			if ((sexo=='M') && (exp=='S')) {
				sexoMcomExp++;
			} else if ((sexo=='M') && (exp=='N')) {
				sexoMsemExp++;
			} else if ((sexo=='F') && (exp=='S')) {
				sexoFcomExp++;
			} else if ((sexo=='F') && (exp=='N')) {
				sexoFsemExp++;
			} else {
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		} while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", 
				"Titulo", JOptionPane.YES_NO_OPTION)==0);
		JOptionPane.showMessageDialog(null, "Temos no total: \n" + sexoMcomExp +
				" candidatos Masculinos com Experiencia \n" + sexoMsemExp +
				" candidatos Masculinos sem Experiencia \n" + sexoFcomExp +
				" candidatas Femininas com Experiencia \n" + sexoFsemExp +
				" candidatas Femininas sem Experiencia");
	}
}
