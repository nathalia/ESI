package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Professor;

public interface ProfessorService {
	/**
	 * Metodo para retornar uma lista de professors
	 * 
	 * @return List<Professor>
	 */
	List<Professor> listAll();

	/**
	 * Metodo para recuperar um professor com certo nome
	 * 
	 * @param name
	 * @return Professor
	 */
	Professor getProfessorByName(String name);
	/**
	 * Metodo para recuperar um professor atraves do id
	 * 
	 * @param id
	 * @return Professor
	 */
	Professor getProfessor(Integer id);

	/**
	 * Metodo para salvar professor
	 * 
	 * @param professor
	 * @return Professor
	 */
	Professor saveProfessor(Professor professor);
	
	/**
	 * Metodo para atualizar professor
	 * 
	 * @param professor
	 * @return Professor
	 */
	Professor updateProfessor(Professor professor);

	/**
	 * Metodo para excluir um professor
	 * 
	 * @param professor
	 * @return Professor
	 */
	Professor deleteProfessor(Professor professor);
}
