package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		double valorDiaria = 80.00;
		int quantidadeDiarias = Integer.parseInt(JOptionPane.showInputDialog
				("Digite a quantidade de diarias:"));
		double valorTotal;

		if (quantidadeDiarias > 15) {

			valorTotal = (valorDiaria * quantidadeDiarias) + (quantidadeDiarias * 5.50);
			System.out.println("O valor total das diarias �: " + valorTotal);

		} else if (quantidadeDiarias < 15) {

			valorTotal = (valorDiaria * quantidadeDiarias) + (quantidadeDiarias * 8);
			System.out.println("O valor total das diarias �: " + valorTotal);
		} else {

			valorTotal = (valorDiaria * quantidadeDiarias) + (quantidadeDiarias * 6);
			System.out.println("O valor total das diarias �: " + valorTotal);

		}


	}




	/*

		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = 6;
		}else if (diarias<15) {
			taxa = 8;
		}
		System.out.println("Total: " + ((80 + taxa) * diarias));
		/*
		short diarias2 = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float valorDiaria = (float) 85.5;
		if (diarias2==15) {
			valorDiaria = 86;
		}else if (diarias2<15) {
			valorDiaria = 88;
		}
		System.out.println("Total: " + (valorDiaria * diarias));
	 */	

}



