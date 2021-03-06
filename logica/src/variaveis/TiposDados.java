package 
variaveis;

import javax.swing.JOptionPane;

/*
 *  Caracteristicas do Java:
 *  - OO
 *  - medio nivel
 *  - arquitetura hibrida
 */

public class TiposDados {
	// main eh o metodo start point de uma app Java
	public static void main(String[] args) {
		//<Tipo de dado> Mnome/identificador> = <valor>;
		String nome = JOptionPane.showInputDialog("Digite seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite a peso: "));
		double imc = peso / (altura * altura);
		
		System.out.print(nome);
		System.out.print(idade);
		System.out.println(altura);
		
		System.out.println("Nome.: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura.: \n" + altura);
		System.out.println("IMC.:" + imc);
		
		/*
		 *  Tipos de dados
		 *  - Numericos: eh o dado pode ser utilizado em expressoes matematicas 
		 *  e/ou for um dado critico para o cenario que se propoe
		 *  CEP (diante de um contexto dos Correios): 00010-009 => 1
		 *  Telefone (do delivery da pizzaria)
		 *  Em Javanes:
		 *  - int => somente para numeros inteiros
		 *  - double => para numeros com casas decimais (numeros reais)
		 *  
		 *  - Alfanumericos: eh o dado que nao esta envolvido em operacoes matematicas
		 *  CEP: 00010-009 => 00010-009
		 */
		
	} //fechando o metodo


} //fechando a class
