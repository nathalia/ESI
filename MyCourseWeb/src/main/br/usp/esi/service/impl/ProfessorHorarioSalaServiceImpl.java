package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.ProfessorHorarioSalaDAO;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.service.ProfessorHorarioSalaService;

public class ProfessorHorarioSalaServiceImpl implements ProfessorHorarioSalaService {
	private ProfessorHorarioSalaDAO professorHorarioSalaDAO = new ProfessorHorarioSalaDAO();

	@Override
	public List<ProfessorHorarioSala> listAll() {
		return professorHorarioSalaDAO.findAll(ProfessorHorarioSala.class);
	}

	@Override
	public ProfessorHorarioSala getProfessorHorarioSala(Integer id) {
		return (ProfessorHorarioSala)professorHorarioSalaDAO.find(ProfessorHorarioSala.class, id);
	}

	@Override
	public ProfessorHorarioSala saveProfessorHorarioSala(
			ProfessorHorarioSala professorHorarioSala) {
		return (ProfessorHorarioSala) professorHorarioSalaDAO.insert(professorHorarioSala);
	}

	@Override
	public ProfessorHorarioSala deleteProfessorHorarioSala(
			ProfessorHorarioSala professorHorarioSala) {
		if (professorHorarioSalaDAO.delete(professorHorarioSala))
			return professorHorarioSala;
		else
			return null;
	}
	
	@Override
	public List<ProfessorHorarioSala> savebatch(List<ProfessorHorarioSala> list){
		for (ProfessorHorarioSala professorHorarioSala : list) {
			this.saveProfessorHorarioSala(professorHorarioSala);
		}
		return list;
	}

}
