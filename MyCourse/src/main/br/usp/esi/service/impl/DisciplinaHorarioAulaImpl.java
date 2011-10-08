package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.DisciplinaHorarioAulaDAO;
import main.br.usp.esi.entities.DisciplinaHorarioAula;
import main.br.usp.esi.service.DisciplinaHorarioAulaService;

public class DisciplinaHorarioAulaImpl implements DisciplinaHorarioAulaService {
	private DisciplinaHorarioAulaDAO disciplinaHorarioAulaDAO = new DisciplinaHorarioAulaDAO();

	@Override
	public List<DisciplinaHorarioAula> listAll() {
		return disciplinaHorarioAulaDAO.getAll();
	}

	@Override
	public DisciplinaHorarioAula getDisciplinaHorarioAula(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
