package variaveis;

import javax.swing.JOptionPane;


/*Regras de Identificadores (nomes que utiliza dentro da programacao)
 * 1 - Nao comecar com numeros
 * 2 - Nao utilizar palavras reservadas
 * 3 - Nao utilizar caracter especial
 * 
 * 
 * Padroes:
 * - UML : Padrao para OO
 * 		- Classes devem comecar com letras maiusculas
 * 		- Variavies comecam com letras minusculas (substantivos)
 * 		- Metodos comecam com letras minusculas, verbos e sao seguidos de parenteses
 * - CamelCase : maiusculas e minusculas
 * 		- da segunda palavra em diante, todas as palavras deve iniciar com letras maiusculas
 * - Utilizar nomes significativos
 * 
 */


public class TiposDadosDesafio {
	
	public static void main(String[] args) {
		/*
		 * Capturem: Nome de um produto, valor de compra e a qtde
		 * Sobre o valor de compra considerem um lucro de 20% para obterem o valor de venda
		 * Calcule o total considerando o valor de venda e qtde
		 * Sobre o total acima, calcule 22% de impostos
		 * No final exiba:
		 * O nome do produto
		 * Valor de venda
		 * O total sem impostos
		 */
		
		String nome = JOptionPane.showInputDialog("Digite Nome do Produto");
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor da Compra: "));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog ("Quantidade Vendida: "));

		double valorVenda = ((valorCompra * 0.20) + valorCompra);
		double valorTotal = (valorVenda * qtde);
		double valorImpostos = ((valorTotal * 0.22) + valorTotal);
		
		System.out.println("Nome do Produto.: " + nome);
		System.out.println("Valor da Venda do Produto.: " + valorVenda);
		System.out.println("Total sem Impostos: " + valorTotal);
		System.out.println("Total com Impostos: " + valorImpostos);
		
		
		/*
		 * JAVA ME (Micro Edition): para dispositivos que na ocontem Sismte Operacional
		 * JAVA SE (Standard Edition): para aplicacoes stand alone (local)
		 * JAVA EE (Enterprise Edition): para aplicacoes WEB
		 */
		
		
	}

}
