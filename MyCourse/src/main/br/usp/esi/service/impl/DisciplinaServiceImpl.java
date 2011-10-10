package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.DisciplinaDAO;
import main.br.usp.esi.entities.Disciplina;
import main.br.usp.esi.service.DisciplinaService;

public class DisciplinaServiceImpl implements DisciplinaService {
	private DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
	
	@Override
	public List<Disciplina> listAll() {
		return disciplinaDAO.findAll(Disciplina.class);
	}

	@Override
	public Disciplina getDisciplina(Integer id) {
		return (Disciplina)disciplinaDAO.getEntity(Disciplina.class, id);
	}

	@Override
	public Disciplina saveDisciplina(Disciplina disciplina) {
		return (Disciplina)disciplinaDAO.insert(disciplina);
	}

	@Override
	public Disciplina deleteDisciplina(Disciplina disciplina) {
		if(disciplinaDAO.delete(disciplina))
			return disciplina;
		else
			return null;
	}

	@Override
	public Disciplina updateDisciplina(Disciplina disciplina) {
		if(disciplinaDAO.update(disciplina))
			return disciplina;
		else
			return null;
	}

}
