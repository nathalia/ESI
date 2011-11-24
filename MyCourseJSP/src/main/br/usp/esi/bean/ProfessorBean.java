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

	public List<String> getProfessores() {
		List<String> professores = new ArrayList<String>();
		ProfessorService professorService = new ProfessorServiceImpl();
		for (Professor professor : professorService.listAll()) {
			professores.add(professor.getNome());
		}
		return professores;
	}

	public List<Professor> getProfessoresObj() {
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
	private boolean preferenciaRepetida(){
		List<Integer> preferencias = new ArrayList<Integer>();
		preferencias.add(prof.getPreferencia1());
		preferencias.add(prof.getPreferencia2());
		preferencias.add(prof.getPreferencia3());
		preferencias.add(prof.getPreferencia4());
		
		if(preferencias.subList(1, preferencias.size()).contains(prof.getPreferencia1()))
			return true;
		if(preferencias.subList(2, preferencias.size()).contains(prof.getPreferencia2()))
			return true;
		if(preferencias.subList(3, preferencias.size()).contains(prof.getPreferencia3()))
			return true;
		return false;
	}
	
	public String save(){
		if(preferenciaRepetida())
			return "preferenciaRepetida";
		ProfessorService professorService = new ProfessorServiceImpl();
		professorService.updateProfessor(prof);
		return "alteracaoPref";
	}
	
}
