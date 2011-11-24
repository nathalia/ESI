package main.br.usp.esi.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.entities.Sala;
import main.br.usp.esi.service.ProfessorService;
import main.br.usp.esi.service.SalaService;
import main.br.usp.esi.service.impl.ProfessorServiceImpl;
import main.br.usp.esi.service.impl.SalaServiceImpl;
import main.br.usp.esi.service.impl.SchedulerImpl;

@ManagedBean
@SessionScoped
public class ProfessorHorarioSalaBean {
	private String prof1;
	private String prof2;
	private String prof3;
	private String prof4;
	private String prof5;
	private String prof6;
	private String prof7;
	private String prof8;
	private String prof9;
	private String salaSelecionada;
	List<Professor> professores;
	List<String> salas;
	List<Professor> professoresSelecionados = new ArrayList<Professor>();
	private Professor professor;
	private ArrayList<ProfessorHorarioSala> schedule;
	
	public String getProf1() {
		return prof1;
	}
	public void setProf1(String prof1) {
		this.prof1 = prof1;
	}
	public String getProf2() {
		return prof2;
	}
	public void setProf2(String prof2) {
		this.prof2 = prof2;
	}
	public String getProf3() {
		return prof3;
	}
	public void setProf3(String prof3) {
		this.prof3 = prof3;
	}
	public String getProf4() {
		return prof4;
	}
	public void setProf4(String prof4) {
		this.prof4 = prof4;
	}
	public String getProf5() {
		return prof5;
	}
	public void setProf5(String prof5) {
		this.prof5 = prof5;
	}
	public String getProf6() {
		return prof6;
	}
	public void setProf6(String prof6) {
		this.prof6 = prof6;
	}
	public String getProf7() {
		return prof7;
	}
	public void setProf7(String prof7) {
		this.prof7 = prof7;
	}
	public String getProf8() {
		return prof8;
	}
	public void setProf8(String prof8) {
		this.prof8 = prof8;
	}
	public String getProf9() {
		return prof9;
	}
	public void setProf9(String prof9) {
		this.prof9 = prof9;
	}
	public String getSalaSelecionada() {
		return salaSelecionada;
	}
	public void setSalaSelecionada(String salaSelecionada) {
		this.salaSelecionada = salaSelecionada;
	}
	public ArrayList<ProfessorHorarioSala> getSchedule() {
		return schedule;
	}
	public void setSchedule(ArrayList<ProfessorHorarioSala> schedule) {
		this.schedule = schedule;
	}
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
	
	public List<String> getSalas(){
		SalaService salaService = new SalaServiceImpl();
		salas = new ArrayList<String>();
		for (Sala sala : salaService.listAll()) {
			salas.add(sala.getNumeroSala()+"");
		}
		return salas;
	}
	
	public String resposta(){
		ProfessorService professorService = new ProfessorServiceImpl();
		SalaService salaService =  new SalaServiceImpl();
		Professor professor1 = professorService.getProfessorByName(prof1);
		Professor professor2 = professorService.getProfessorByName(prof2);
		Professor professor3 = professorService.getProfessorByName(prof3);
		Professor professor4 = professorService.getProfessorByName(prof4);
		Professor professor5 = professorService.getProfessorByName(prof5);
		Professor professor6 = professorService.getProfessorByName(prof6);
		Professor professor7 = professorService.getProfessorByName(prof7);
		Professor professor8 = professorService.getProfessorByName(prof8);
		Professor professor9 = professorService.getProfessorByName(prof9);
		
		professoresSelecionados.add(professor1);
		professoresSelecionados.add(professor2);
		professoresSelecionados.add(professor3);
		professoresSelecionados.add(professor4);
		professoresSelecionados.add(professor5);
		professoresSelecionados.add(professor6);
		professoresSelecionados.add(professor7);
		professoresSelecionados.add(professor8);
		professoresSelecionados.add(professor9);
		
		Sala sala = salaService.getSalaByNumber(Integer.parseInt(salaSelecionada));
		
		SchedulerImpl scheduleImpl = new SchedulerImpl();
		ArrayList<List<Integer>> preferences = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		ArrayList<ProfessorHorarioSala> schedule = scheduleImpl.schedule(professores, preferences, sala);
		
		return "teste";
	}
}
