package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;

public class TestarAluno {

	public static void main(String[] args) {
		
		
		Aluno objeto = new Aluno();

		objeto.setBasico("Renan", 3123);
		objeto.setCpf("123123312");
		objeto.setEmail("renan@itau.com.br");
		objeto.setFone("3123-3133");
		
		System.out.println(objeto.toString());
		

	}

}
