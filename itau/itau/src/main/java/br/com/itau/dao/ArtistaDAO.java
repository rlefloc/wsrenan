package br.com.itau.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Artista;

/*
 * DAO => é um pattern que sugestiona onde devem ficar os comandos SQL DML.
 * Dentro das classes DAO´s:
 * Deve montar o CRUD (Create - Read - Update - Delete)
 * 
 */

public interface ArtistaDAO extends CrudRepository<Artista, Integer>{
	
	List<Artista> findByNacionalidade(String nacionalidade);
	
	List<Artista> findByNomeArtisticoLike(String nome);
		

	
}