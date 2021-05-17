package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main (String[] args) {

		List <Cargo> lista = new ArrayList<Cargo>();

		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "SR", 15000));

		System.out.println("Completa: " + lista);
		double salariototal=0;
		int totaldba=0;
		int qtdejr=0;
		Cargo resposta = new Cargo();

		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nivel: " + objeto.getNivel());
			System.out.println("Salario: " + objeto.getSalario());
			System.out.println("========================");
			salariototal = objeto.getSalario() + salariototal;	
			if (objeto.getNome()=="DBA") {
				totaldba+=objeto.getSalario();
			}
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				qtdejr++;
			}
			if (objeto.getSalario()>resposta.getSalario()) {
				resposta=objeto;
			}

			System.out.println("Salario total: " + salariototal);

			System.out.println("Media de salarios: " + (salariototal/lista.size()));

			System.out.println("Salario dos DBAs: " + totaldba);

			System.out.println("Quantidade de JRs: " + qtdejr);

			System.out.println("Cargo e nivel com Salario maior: " + resposta.getNome() + " " + resposta.getNivel());


			/*
			 * Requisicao: exibir total de salario
			 * - media dos salarios
			 * - total dos dbas
			 * - quantidade de cargos nivel jr
			 * - nome do cargo e o nivel que possui maior salario
			 */

		}


	}
}	
