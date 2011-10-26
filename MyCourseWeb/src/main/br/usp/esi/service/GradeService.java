package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Grade;

public interface GradeService {
	/**
	 * Metodo para retornar uma lista de grades
	 * 
	 * @return List<Grade>
	 */
	List<Grade> listAll();

	/**
	 * Metodo para recuperar um grade atraves do id
	 * 
	 * @param id
	 * @return Grade
	 */
	Grade getGrade(Integer id);

	/**
	 * Metodo para salvar/atualizar grade
	 * 
	 * @param grade
	 * @return Grade
	 */
	Grade saveGrade(Grade grade);

	/**
	 * Metodo para excluir um grade
	 * 
	 * @param grade
	 * @return Grade
	 */
	Grade deleteGrade(Grade grade);

	Grade updateGrade(Grade grade);
}
