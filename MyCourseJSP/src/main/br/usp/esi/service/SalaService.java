package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Sala;

public interface SalaService {
	/**
	 * Metodo para retornar uma lista de salas
	 * 
	 * @return List<Sala>
	 */
	List<Sala> listAll();

	/**
	 * Metodo para recuperar um sala atraves numero da sala
	 * 
	 * @param numeroSala
	 * @return Sala
	 */
	Sala getSalaByNumber(int numeroSala);
	/**
	 * Metodo para recuperar um sala atraves do id
	 * 
	 * @param id
	 * @return Sala
	 */
	Sala getSala(Integer id);

	/**
	 * Metodo para salvar sala
	 * 
	 * @param sala
	 * @return Sala
	 */
	Sala saveSala(Sala sala);
	
	/**
	 * Metodo para atualizar sala
	 * 
	 * @param sala
	 * @return Sala
	 */
	Sala updateSala(Sala sala);

	/**
	 * Metodo para excluir um sala
	 * 
	 * @param sala
	 * @return sala
	 */
	Sala deleteSala(Sala sala);
}
