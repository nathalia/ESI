package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.DisciplinaHorarioAulaDAO;
import main.br.usp.esi.entities.DisciplinaHorarioAula;
import main.br.usp.esi.service.DisciplinaHorarioAulaService;

public class DisciplinaHorarioAulaServiceImpl implements DisciplinaHorarioAulaService {
	private DisciplinaHorarioAulaDAO disciplinaHorarioAulaDAO = new DisciplinaHorarioAulaDAO();

	@Override
	public List<DisciplinaHorarioAula> listAll() {
		return disciplinaHorarioAulaDAO.findAll(DisciplinaHorarioAula.class);
	}

	@Override
	public DisciplinaHorarioAula getDisciplinaHorarioAula(Integer id) {
		return (DisciplinaHorarioAula)disciplinaHorarioAulaDAO.find(DisciplinaHorarioAula.class, id);
	}

	@Override
	public DisciplinaHorarioAula saveDisciplinaHorarioAula(
			DisciplinaHorarioAula disciplinaHorarioAula) {
		return (DisciplinaHorarioAula) disciplinaHorarioAulaDAO.insert(disciplinaHorarioAula);
	}

	@Override
	public DisciplinaHorarioAula deleteDisciplinaHorarioAula(
			DisciplinaHorarioAula disciplinaHorarioAula) {
		if (disciplinaHorarioAulaDAO.delete(disciplinaHorarioAula))
			return disciplinaHorarioAula;
		else
			return null;
	}

}
