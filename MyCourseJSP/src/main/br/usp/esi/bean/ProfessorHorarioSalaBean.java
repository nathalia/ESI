package main.br.usp.esi.bean;

import java.util.ArrayList;
import java.util.Arrays;
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
	private List<ProfessorHorarioSala> schedule = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> segunda = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> terca = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> quarta = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> quinta = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> sexta = new ArrayList<ProfessorHorarioSala>();
	private List<ProfessorHorarioSala> sabado = new ArrayList<ProfessorHorarioSala>();
	
	
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
	public List<ProfessorHorarioSala> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<ProfessorHorarioSala> schedule) {
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
		System.out.println("ME CHAMO");
		ProfessorService professorService = new ProfessorServiceImpl();
		SalaService salaService =  new SalaServiceImpl();
		Professor professor1 = professorService.getProfessorByName(prof1);
		List<Integer> prefProfessor1 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor1.set(professor1.getPreferencia1(), 1);
		prefProfessor1.set(professor1.getPreferencia2(), 1);
		prefProfessor1.set(professor1.getPreferencia3(), 1);
		prefProfessor1.set(professor1.getPreferencia4(), 1);
		Professor professor2 = professorService.getProfessorByName(prof2);
		List<Integer> prefProfessor2 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor2.set(professor2.getPreferencia1(), 1);
		prefProfessor2.set(professor2.getPreferencia2(), 1);
		prefProfessor2.set(professor2.getPreferencia3(), 1);
		prefProfessor2.set(professor2.getPreferencia4(), 1);
		Professor professor3 = professorService.getProfessorByName(prof3);
		List<Integer> prefProfessor3 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor3.set(professor3.getPreferencia1(), 1);
		prefProfessor3.set(professor3.getPreferencia2(), 1);
		prefProfessor3.set(professor3.getPreferencia3(), 1);
		prefProfessor3.set(professor3.getPreferencia4(), 1);
		Professor professor4 = professorService.getProfessorByName(prof4);
		List<Integer> prefProfessor4 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor4.set(professor4.getPreferencia1(), 1);
		prefProfessor4.set(professor4.getPreferencia2(), 1);
		prefProfessor4.set(professor4.getPreferencia3(), 1);
		prefProfessor4.set(professor4.getPreferencia4(), 1);
		Professor professor5 = professorService.getProfessorByName(prof5);
		List<Integer> prefProfessor5 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor5.set(professor5.getPreferencia1(), 1);
		prefProfessor5.set(professor5.getPreferencia2(), 1);
		prefProfessor5.set(professor5.getPreferencia3(), 1);
		prefProfessor5.set(professor5.getPreferencia4(), 1);
		Professor professor6 = professorService.getProfessorByName(prof6);
		List<Integer> prefProfessor6 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor6.set(professor6.getPreferencia1(), 1);
		prefProfessor6.set(professor6.getPreferencia2(), 1);
		prefProfessor6.set(professor6.getPreferencia3(), 1);
		prefProfessor6.set(professor6.getPreferencia4(), 1);
		Professor professor7 = professorService.getProfessorByName(prof7);
		List<Integer> prefProfessor7 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor7.set(professor7.getPreferencia1(), 1);
		prefProfessor7.set(professor7.getPreferencia2(), 1);
		prefProfessor7.set(professor7.getPreferencia3(), 1);
		prefProfessor7.set(professor7.getPreferencia4(), 1);
		Professor professor8 = professorService.getProfessorByName(prof8);
		List<Integer> prefProfessor8 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor8.set(professor8.getPreferencia1(), 1);
		prefProfessor8.set(professor8.getPreferencia2(), 1);
		prefProfessor8.set(professor8.getPreferencia3(), 1);
		prefProfessor8.set(professor8.getPreferencia4(), 1);
		Professor professor9 = professorService.getProfessorByName(prof9);
		List<Integer> prefProfessor9 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		prefProfessor9.set(professor9.getPreferencia1(), 1);
		prefProfessor9.set(professor9.getPreferencia2(), 1);
		prefProfessor9.set(professor9.getPreferencia3(), 1);
		prefProfessor9.set(professor9.getPreferencia4(), 1);
		
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
		preferences.add(prefProfessor1);
		preferences.add(prefProfessor2);
		preferences.add(prefProfessor3);
		preferences.add(prefProfessor4);
		preferences.add(prefProfessor5);
		preferences.add(prefProfessor6);
		preferences.add(prefProfessor7);
		preferences.add(prefProfessor8);
		preferences.add(prefProfessor9);
		
		schedule = scheduleImpl.schedule(professoresSelecionados, preferences, sala);
		segunda = schedule.subList(0, 6);
		terca =  schedule.subList(6, 12);
		quarta = schedule.subList(12, 18);
		quinta =  schedule.subList(18, 24);
		sexta =  schedule.subList(24, 30);
		sabado =  schedule.subList(30, 36);

		return "escalonamentoResult";
	}
	public List<ProfessorHorarioSala> getSegunda() {
		return segunda;
	}
	public void setSegunda(List<ProfessorHorarioSala> segunda) {
		this.segunda = segunda;
	}
	public List<ProfessorHorarioSala> getTerca() {
		return terca;
	}
	public void setTerca(List<ProfessorHorarioSala> terca) {
		this.terca = terca;
	}
	public List<ProfessorHorarioSala> getQuarta() {
		return quarta;
	}
	public void setQuarta(List<ProfessorHorarioSala> quarta) {
		this.quarta = quarta;
	}
	public List<ProfessorHorarioSala> getQuinta() {
		return quinta;
	}
	public void setQuinta(List<ProfessorHorarioSala> quinta) {
		this.quinta = quinta;
	}
	public List<ProfessorHorarioSala> getSexta() {
		return sexta;
	}
	public void setSexta(List<ProfessorHorarioSala> sexta) {
		this.sexta = sexta;
	}
	public List<ProfessorHorarioSala> getSabado() {
		return sabado;
	}
	public void setSabado(List<ProfessorHorarioSala> sabado) {
		this.sabado = sabado;
	}
	

}
