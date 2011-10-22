package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Disciplina;


public interface DisciplinaService {
	/**
	 * Metodo para retornar uma lista de disciplinas
	 * 
	 * @return List<Disciplina>
	 */
	List<Disciplina> listAll();

	/**
	 * Metodo para recuperar um disciplina atraves do id
	 * 
	 * @param id
	 * @return Disciplina
	 */
	Disciplina getDisciplina(Integer id);

	/**
	 * Metodo para salvar disciplina
	 * 
	 * @param disciplina
	 * @return Disciplina
	 */
	Disciplina saveDisciplina(Disciplina disciplina);
	
	/**
	 * Metodo para atualizar disciplina
	 * 
	 * @param disciplina
	 * @return Disciplina
	 */
	Disciplina updateDisciplina(Disciplina disciplina);

	/**
	 * Metodo para excluir um disciplina
	 * 
	 * @param disciplina
	 * @return disciplina
	 */
	Disciplina deleteDisciplina(Disciplina disciplina);
}
