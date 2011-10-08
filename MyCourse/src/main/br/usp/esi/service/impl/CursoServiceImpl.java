package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.CursoDAO;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.service.CursoService;

public class CursoServiceImpl implements CursoService {
	private CursoDAO cursoDAO = new CursoDAO(); 
	
	@Override
	public List<Curso> listAll() {
		return cursoDAO.getAll();
	}

	@Override
	public Curso getCurso(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso saveCurso(Curso curso) {
		return (Curso)cursoDAO.insert(curso);
	}

	@Override
	public Curso deleteCurso(Curso curso) {
		if (cursoDAO.delete(curso))
			return curso;
		else
			return null;
	}

}
