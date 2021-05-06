package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		
		//Instanciar um objeto
		Veiculo objeto = new Veiculo();
		
		//2 preencher os dados
		objeto.preencherModelo(JOptionPane.showInputDialog("modelo"));
		objeto.preencherMontadora(JOptionPane.showInputDialog("montadora"));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor:")));		
		
		//3 exibir os dados
		System.out.println("Modelo: " + objeto.retonarModelo());
		System.out.println("Montadora: " + objeto.retornarMontadora());
		System.out.println("Valor total: " + objeto.retornarValor());
		System.out.println("Valor com desconto: " + objeto.retornarDesconto());
		
		
/*
 * 
 *		objeto.preencherMontadora(JOptionPane.showInputDialog("montadora"));
		System.out.println("Montadora: " + objeto.retornarMontadora());
		
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor:")));
		System.out.println("Valor total: " + objeto.retornarValor());
		System.out.println("Valor com desconto: " + objeto.retornarDesconto());
 * 
 * 		
 */
		
		
		Veiculo objeto2 = new Veiculo();
		objeto2.preencherTudo(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor: ")), JOptionPane.showInputDialog("Digite o modelo: "), JOptionPane.showInputDialog("Digite a montadora"));
		System.out.println(objeto2.retornarTudo());
		
		
		
		
	}

}
