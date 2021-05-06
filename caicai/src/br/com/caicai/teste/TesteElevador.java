package br.com.caicai.teste;

import javax.swing.JOptionPane;

import br.com.caicai.modelo.Elevador;


public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();
		
		//preencher os dados do elevador
		objeto.inicializar(JOptionPane.showInputDialog("Digite o Nome: "),Integer.parseInt( 
				JOptionPane.showInputDialog("Digite o andar maximo: ")), Integer.parseInt(JOptionPane.showInputDialog("Digite o andar minimo")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de pessoas")));
		System.out.println(objeto.retornarTudo());	
		
		
		objeto.entrar();
		System.out.println(objeto.subir());
		
		objeto.entrar();
		System.out.println(objeto.subir());

		objeto.entrar();
		System.out.println(objeto.subir());

		
		
	    objeto.sair();
		System.out.println(objeto.descer());

		
		//nao comunica nada porque o metodo eh void
		objeto.entrar(20);
		
		
		

    	System.out.println(objeto.retornarTudo());	
		
		

		
		
		
		
		
	}
	
	
	

}
