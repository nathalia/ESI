package main.br.usp.esi.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.service.ProfessorService;
import main.br.usp.esi.service.impl.ProfessorServiceImpl;

@ManagedBean
@ApplicationScoped
public class ProfessorBean {
	
	private Professor prof;
	
	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public List<Professor> getProfessores() {
		List<Professor> professores = new ArrayList<Professor>();
		ProfessorService professorService = new ProfessorServiceImpl();
		for (Professor professor : professorService.listAll()) {
			professores.add(professor);
		}
		return professores;
	}
	
	public String editProfessor() {
		FacesContext context = FacesContext.getCurrentInstance();  
		Map requestMap = context.getExternalContext().getRequestParameterMap();  
		String nome = (String)requestMap.get("profNome");  
		ProfessorService professorService = new ProfessorServiceImpl();
		setProf(professorService.getProfessorByName((String)nome));
		return "professorPref";
	}
	
	public List<Integer> getPrefs(){
		List<Integer> prefs = new ArrayList<Integer>();
		for(int i = 1; i< 37; i++)
			prefs.add(i);
		return prefs;
	}
}
