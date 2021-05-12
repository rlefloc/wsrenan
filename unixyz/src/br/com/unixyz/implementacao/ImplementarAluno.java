package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();

		aluno.setBasico("Renan", 3123);
		aluno.setCpf("123123312");
		aluno.setEmail("renan@itau.com.br");
		aluno.setFone("3123-3133");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Itaquera");
		endereco.setCep("12345-123");
		endereco.setCidade("Sao Paulo");
		endereco.setComplemento("Viela 5");
		endereco.setEstado("SP");
		endereco.setLogradouro("Avenida Itaquera");
		endereco.setNumero("5A");
		
		aluno.setEndereco(endereco);
		
		System.out.println(aluno.toString());
		

	}

}
