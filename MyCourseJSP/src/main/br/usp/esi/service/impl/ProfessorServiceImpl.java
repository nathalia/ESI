package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.ProfessorDAO;
import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
	private ProfessorDAO professorDAO = new ProfessorDAO(); 
	
	@Override
	public List<Professor> listAll() {
		return professorDAO.findAll(Professor.class);
	}

	@Override
	public Professor getProfessor(Integer id) {
		return (Professor)professorDAO.find(Professor.class, id);
	}

	@Override
	public Professor saveProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor updateProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor deleteProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor getProfessorByName(String name) {
		return professorDAO.findByName(name);
	}

}
