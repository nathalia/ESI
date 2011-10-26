package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.GradeDAO;
import main.br.usp.esi.entities.Grade;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.GradeService;

public class GradeServiceImpl implements GradeService {
	private GradeDAO gradeDAO = new GradeDAO();
	@Override
	public List<Grade> listAll() {
		return gradeDAO.findAll(Grade.class);
	}

	@Override
	public Grade getGrade(Integer id) {
		return (Grade)gradeDAO.find(Grade.class, id);
	}

	@Override
	public Grade saveGrade(Grade grade) {
		return (Grade)gradeDAO.insert(grade);
	}

	@Override
	public Grade deleteGrade(Grade grade) {
		if (gradeDAO.delete(grade))
			return grade;
		else
			return null;
	}
	
	@Override
	public Grade updateGrade(Grade grade) {
		if (gradeDAO.update(grade))
			return grade;
		else
			return null;
	}

}
