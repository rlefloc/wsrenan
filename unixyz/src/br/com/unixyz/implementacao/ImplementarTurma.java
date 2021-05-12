package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {
		
		//turma = int codigo, String nome, String periodo, Professor professor, Curso curso		
		//professor = String endereco, String nome, String titulacao, double valorHora
		//curso = String descricao, String sigla, double valor, String formacao
		//int rm, String nome, String email, String fone, String cpf, Endereco endereco
		Turma turma = new Turma(
				Integer.parseInt(JOptionPane.showInputDialog("Codigo Turma")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Periodo").toLowerCase(),
				new Professor (
						JOptionPane.showInputDialog("Endereco").toUpperCase(),
						JOptionPane.showInputDialog("Nome").toUpperCase(),
						JOptionPane.showInputDialog("Titulacao").toUpperCase(),
						Double.parseDouble(JOptionPane.showInputDialog("Valor Hora"))
						),
				new Curso (
						JOptionPane.showInputDialog("Descricao").toUpperCase(),
						JOptionPane.showInputDialog("Sigla").toUpperCase(),
						Double.parseDouble(JOptionPane.showInputDialog("Valor")),
						JOptionPane.showInputDialog("Formacao").toUpperCase()
						),
				new Aluno(

						Integer.parseInt(JOptionPane.showInputDialog("RM")),
						JOptionPane.showInputDialog("Nome").toUpperCase(),
						JOptionPane.showInputDialog("Email").toLowerCase(),
						JOptionPane.showInputDialog("Fone"),
						JOptionPane.showInputDialog("CPF"),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro").toUpperCase(),
								JOptionPane.showInputDialog("Bairro").toUpperCase(),
								JOptionPane.showInputDialog("Cidade").toUpperCase(),
								JOptionPane.showInputDialog("Estado").toUpperCase(),
								JOptionPane.showInputDialog("CEP").toUpperCase(),
								JOptionPane.showInputDialog("Numero").toUpperCase(),
								JOptionPane.showInputDialog("Complemento").toUpperCase()
								)
						)
		
				
				);
		
		
		//System.out.println(aluno.getEndereco().getLogradouro());
		
		System.out.println("Professor: " + turma.getProfessor().getNome());
		System.out.println("Aluno: " + turma.getAluno().getNome());
		System.out.println("Cidade do Aluno: " + turma.getAluno().getEndereco().getCidade());
		System.out.println("Nome do Cursco: " + turma.getCurso().getDescricao());
		System.out.println("Nome da Turma: " + turma.getNome());	
		

	}

}
