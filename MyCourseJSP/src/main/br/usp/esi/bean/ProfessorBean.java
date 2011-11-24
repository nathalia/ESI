package main.br.usp.esi.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.eds.common.jsf.BaseBackingBean;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.service.ProfessorService;
import main.br.usp.esi.service.impl.ProfessorServiceImpl;

@ManagedBean
@ApplicationScoped
public class ProfessorBean {

	public List<Professor> getProfessores() {
		List<Professor> professores = new ArrayList<Professor>();
		System.out.println("SOCORRO");
		ProfessorService professorService = new ProfessorServiceImpl();
		for (Professor professor : professorService.listAll()) {
			professores.add(professor);
		}
		return professores;
	}
}
