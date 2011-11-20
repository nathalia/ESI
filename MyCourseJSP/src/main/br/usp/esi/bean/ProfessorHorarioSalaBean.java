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
public class ProfessorHorarioSalaBean {
	List<Professor> professores;
	List<Professor> professoresSelecionados = new ArrayList<Professor>();
	private Professor professor;

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor){
		System.out.println(professor.getId());
		professoresSelecionados.add(professor);
	}
	public List<Professor> getProfessores() {
		professores = new ArrayList<Professor>();
		ProfessorService professorService = new ProfessorServiceImpl();
		for (Professor professor : professorService.listAll()) {
			professores.add(professor);
		}
		return professores;
	}
	public void resposta(){
		for (Professor professor : professoresSelecionados) {
			System.out.println(professor.getNome());
		}
	}
	
	

}
