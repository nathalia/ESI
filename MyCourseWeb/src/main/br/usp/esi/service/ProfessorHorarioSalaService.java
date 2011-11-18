package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.ProfessorHorarioSala;

public interface ProfessorHorarioSalaService {
	/**
	 * Metodo para retornar uma lista de professorHorarioSala
	 * 
	 * @return List<professorHorarioSala>
	 */
	List<ProfessorHorarioSala> listAll();

	/**
	 * Metodo para recuperar um professoraHorarioSala atraves do id
	 * 
	 * @param id
	 * @return professorHorarioSala
	 */
	ProfessorHorarioSala getProfessorHorarioSala(Integer id);

	/**
	 * Metodo para salvar/atualizar professorHorarioSala
	 * 
	 * @param professorHorarioSala
	 * @return ProfessorHorarioSala
	 */
	ProfessorHorarioSala saveProfessorHorarioSala(ProfessorHorarioSala professorHorarioSala);

	/**
	 * Metodo para excluir um professorHorarioSala
	 * 
	 * @param professorHorarioSala
	 * @return professorHorarioSala
	 */
	ProfessorHorarioSala deleteProfessorHorarioSala(ProfessorHorarioSala professorHorarioSala);
	
	/**
	 * Metodo para salvar professorHorarioSala em batch
	 * @return
	 */
	List<ProfessorHorarioSala> savebatch(List<ProfessorHorarioSala> list);
}

