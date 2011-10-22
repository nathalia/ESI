package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.DisciplinaHorarioAula;

public interface DisciplinaHorarioAulaService {
	/**
	 * Metodo para retornar uma lista de disciplinaHorarioAula
	 * 
	 * @return List<DisciplinaHorarioAula>
	 */
	List<DisciplinaHorarioAula> listAll();

	/**
	 * Metodo para recuperar um disciplinaHorarioAula atraves do id
	 * 
	 * @param id
	 * @return DisciplinaHorarioAula
	 */
	DisciplinaHorarioAula getDisciplinaHorarioAula(Integer id);

	/**
	 * Metodo para salvar/atualizar disciplinaHorarioAula
	 * 
	 * @param disciplinaHorarioAula
	 * @return DisciplinaHorarioAula
	 */
	DisciplinaHorarioAula saveDisciplinaHorarioAula(DisciplinaHorarioAula disciplinaHorarioAula);

	/**
	 * Metodo para excluir um disciplinaHorarioAula
	 * 
	 * @param disciplinaHorarioAula
	 * @return disciplinaHorarioAula
	 */
	DisciplinaHorarioAula deleteDisciplinaHorarioAula(DisciplinaHorarioAula disciplinaHorarioAula);
}
