package br.com.lojagama.implementacao;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.PessoaFisica;
import br.com.lojagama.modelo.PessoaJuridica;
import br.com.lojagama.util.Magic;

public class ImplementarCliente {

	public static void main (String [] args) {


		Cliente cli = new Cliente();

		String nome = Magic.s("Nome:");
		String email = Magic.s("Email").toLowerCase();
		String fone = Magic.s("Fone");
		Endereco endereco = new Endereco();

		char resposta = Magic.s("Digite J para PJ ou F para PF").charAt(0);
		if (resposta=='J') {

			PessoaJuridica pj = new PessoaJuridica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CNPJ"),
					Magic.s("CNAE"),
					Magic.s("Contato")
					);
			System.out.println(pj.toString());

		}else if (resposta=='F') {

			PessoaFisica pf = new PessoaFisica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CPF"),
					Magic.s("RG")
					);
			System.out.println(pf.toString());
		}else {
			System.out.println("Opção inválida");
		}

		if (cli instanceof PessoaFisica) {
			System.out.println(((PessoaFisica) cli).getDocumentos());
		}else if (cli instanceof PessoaJuridica) {
			System.out.println(((PessoaJuridica) cli).getDocumentos());
		}
}
}


