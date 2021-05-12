package br.com.lojagama.implementacao;

import javax.swing.JOptionPane;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.Pagamento;
import br.com.lojagama.modelo.Produto;
import br.com.lojagama.modelo.Venda;
import br.com.lojagama.util.Magic;

public class ImplantarProduto {
	

	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Integer.parseInt(Magic.s("NF")),
				Magic.s("Data"),
				new Cliente(
						Magic.s("Nome Cliente"), 
						Magic.s("Email:").toLowerCase(),
						"1234-5678",
						"12321313",
						new Endereco()
						),
				new Produto(
						123,
						"Churros",
						10,
						20,
						100
						),
				new Pagamento(
						500,
						"VISTA",
						"12/05/2021"
						),
				1000
			);
	
	System.out.println(venda.getResumo());
	System.out.println("Sobre o Estoque: " + venda.getProduto().verificarEstoque());
	System.out.println("Venda: " + venda.getProduto().getValorVenda());
	System.out.println("Compra: " + venda.getProduto().getValorCompra());
	venda.getProduto().atualizarValores(10);
	System.out.println("Após atualização: ");
	System.out.println("Venda: " + venda.getProduto().getValorVenda());
	System.out.println("Compra: " + venda.getProduto().getValorCompra());
	System.out.println("Total Venda: " + venda.getProduto().totalVenda());
		
		

	}

}
