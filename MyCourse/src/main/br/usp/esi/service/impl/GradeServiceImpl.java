package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.GradeDAO;
import main.br.usp.esi.entities.Grade;
import main.br.usp.esi.service.GradeService;

public class GradeServiceImpl implements GradeService {
	private GradeDAO gradeDAO = new GradeDAO();
	@Override
	public List<Grade> listAll() {
		return gradeDAO.getAll();
	}

	@Override
	public Grade getGrade(Integer id) {
		// TODO Auto-generated method stub
		return null;
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

}
