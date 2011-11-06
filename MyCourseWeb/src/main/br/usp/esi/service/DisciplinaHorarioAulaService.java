package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.ProfessorHorarioSala;

public interface DisciplinaHorarioAulaService {
	/**
	 * Metodo para retornar uma lista de disciplinaHorarioAula
	 * 
	 * @return List<DisciplinaHorarioAula>
	 */
	List<ProfessorHorarioSala> listAll();

	/**
	 * Metodo para recuperar um disciplinaHorarioAula atraves do id
	 * 
	 * @param id
	 * @return DisciplinaHorarioAula
	 */
	ProfessorHorarioSala getDisciplinaHorarioAula(Integer id);

	/**
	 * Metodo para salvar/atualizar disciplinaHorarioAula
	 * 
	 * @param disciplinaHorarioAula
	 * @return DisciplinaHorarioAula
	 */
	ProfessorHorarioSala saveDisciplinaHorarioAula(ProfessorHorarioSala disciplinaHorarioAula);

	/**
	 * Metodo para excluir um disciplinaHorarioAula
	 * 
	 * @param disciplinaHorarioAula
	 * @return disciplinaHorarioAula
	 */
	ProfessorHorarioSala deleteDisciplinaHorarioAula(ProfessorHorarioSala disciplinaHorarioAula);
}
