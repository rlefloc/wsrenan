package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

	public static void main(String[] args) {
		String escolaridade = "";
		int contM=0;
		int contS=0;
		int contP=0;
		do {
			escolaridade=JOptionPane.showInputDialog("Escolaridade").toUpperCase();
			if (escolaridade.equals("POS")) {
				contP++;
			}else if (escolaridade.equals("MEDIO")) {
				contM++;
			}else if (escolaridade.equals("SUPERIOR")) {
				contS++;
			}
			
		}while(escolaridade.equals("POS") || 
				escolaridade.equals("SUPERIOR") || escolaridade.equals("MEDIO"));
		if (contM>contS && contM>contP) {
			System.out.println("M�dio: " + contM);
		}else if (contS>contP) {
			System.out.println("Superior: " + contS);
		}else {
			System.out.println("P�s: " + contP);
		}

	}

}
