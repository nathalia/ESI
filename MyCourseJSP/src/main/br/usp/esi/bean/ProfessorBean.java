package main.br.usp.esi.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.service.ProfessorService;
import main.br.usp.esi.service.impl.ProfessorServiceImpl;

@ManagedBean
@ApplicationScoped
public class ProfessorBean {
	List<String> professores;


	public List<String> getProfessores() {
		professores = new ArrayList<String>();
		ProfessorService professorService = new ProfessorServiceImpl();
		for (Professor professor : professorService.listAll()) {
			professores.add(professor.getNome());
		}
		return professores;
	}


}
