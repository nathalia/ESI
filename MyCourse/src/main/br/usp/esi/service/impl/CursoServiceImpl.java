package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.CursoDAO;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.CursoService;

public class CursoServiceImpl implements CursoService {
	private CursoDAO cursoDAO = new CursoDAO(); 
	
	@Override
	public List<Curso> listAll() {
		return cursoDAO.findAll(Curso.class);
	}

	@Override
	public Curso getCurso(Integer id) {
		return (Curso)cursoDAO.find(Curso.class, id);
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

	@Override
	public Curso updateCurso(Curso curso) {
		if (cursoDAO.update(curso))
			return curso;
		else
			return null;
	}

}
