package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.DisciplinaHorarioAulaDAO;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.service.DisciplinaHorarioAulaService;

public class DisciplinaHorarioAulaServiceImpl implements DisciplinaHorarioAulaService {
	private DisciplinaHorarioAulaDAO disciplinaHorarioAulaDAO = new DisciplinaHorarioAulaDAO();

	@Override
	public List<ProfessorHorarioSala> listAll() {
		return disciplinaHorarioAulaDAO.findAll(ProfessorHorarioSala.class);
	}

	@Override
	public ProfessorHorarioSala getDisciplinaHorarioAula(Integer id) {
		return (ProfessorHorarioSala)disciplinaHorarioAulaDAO.find(ProfessorHorarioSala.class, id);
	}

	@Override
	public ProfessorHorarioSala saveDisciplinaHorarioAula(
			ProfessorHorarioSala disciplinaHorarioAula) {
		return (ProfessorHorarioSala) disciplinaHorarioAulaDAO.insert(disciplinaHorarioAula);
	}

	@Override
	public ProfessorHorarioSala deleteDisciplinaHorarioAula(
			ProfessorHorarioSala disciplinaHorarioAula) {
		if (disciplinaHorarioAulaDAO.delete(disciplinaHorarioAula))
			return disciplinaHorarioAula;
		else
			return null;
	}

}
