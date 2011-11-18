package test.br.usp.esi.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.dao.ProfessorDAO;
import main.br.usp.esi.dao.SalaDAO;
import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.entities.Sala;
import main.br.usp.esi.service.ProfessorHorarioSalaService;
import main.br.usp.esi.service.impl.ProfessorHorarioSalaServiceImpl;
import main.br.usp.esi.service.impl.SchedulerImpl;

public class SchedulerTest extends TestCase {
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<List<Integer>> preferences = new ArrayList<List<Integer>>();
	
	public void testScheduler(){
		ProfessorHorarioSalaService profHorarioSala = new ProfessorHorarioSalaServiceImpl();
		SchedulerImpl scheduler = new SchedulerImpl();
		SalaDAO salaDAO = new SalaDAO();
		Sala sala = new Sala(1, 221);
		salaDAO.insert(sala);
		
		List<Integer> pref1 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof1 = new Professor("1", 0, 4, 5, 26);
		pref1.set(prof1.getPreferencia1(), 1);
		pref1.set(prof1.getPreferencia2(), 1);
		pref1.set(prof1.getPreferencia3(), 1);
		pref1.set(prof1.getPreferencia4(), 1);
		preferences.add(pref1);
		professores.add(prof1);

		List<Integer> pref2 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof2 = new Professor("2", 11, 14, 15, 35);
		pref2.set(prof2.getPreferencia1(), 1);
		pref2.set(prof2.getPreferencia2(), 1);
		pref2.set(prof2.getPreferencia3(), 1);
		pref2.set(prof2.getPreferencia4(), 1);
		preferences.add(pref2);
		professores.add(prof2);

		List<Integer> pref3 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof3 = new Professor("3", 21, 24, 26, 35);
		pref3.set(prof3.getPreferencia1(), 1);
		pref3.set(prof3.getPreferencia2(), 1);
		pref3.set(prof3.getPreferencia3(), 1);
		pref3.set(prof3.getPreferencia4(), 1);
		preferences.add(pref3);
		professores.add(prof3);

		List<Integer> pref4 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof4 = new Professor("4", 10, 14, 16, 25);
		pref4.set(prof4.getPreferencia1(), 1);
		pref4.set(prof4.getPreferencia2(), 1);
		pref4.set(prof4.getPreferencia3(), 1);
		pref4.set(prof4.getPreferencia4(), 1);
		preferences.add(pref4);
		professores.add(prof4);

		List<Integer> pref5 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof5 = new Professor("5", 8, 18, 27, 30);
		pref5.set(prof5.getPreferencia1(), 1);
		pref5.set(prof5.getPreferencia2(), 1);
		pref5.set(prof5.getPreferencia3(), 1);
		pref5.set(prof5.getPreferencia4(), 1);
		preferences.add(pref5);
		professores.add(prof5);

		List<Integer> pref6 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof6 = new Professor("6", 16, 18, 22, 32);
		pref6.set(prof6.getPreferencia1(), 1);
		pref6.set(prof6.getPreferencia2(), 1);
		pref6.set(prof6.getPreferencia3(), 1);
		pref6.set(prof6.getPreferencia4(), 1);
		preferences.add(pref6);
		professores.add(prof6);

		List<Integer> pref7 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof7 = new Professor("7", 15, 19, 26, 29);
		pref7.set(prof7.getPreferencia1(), 1);
		pref7.set(prof7.getPreferencia2(), 1);
		pref7.set(prof7.getPreferencia3(), 1);
		pref7.set(prof7.getPreferencia4(), 1);
		preferences.add(pref7);
		professores.add(prof7);

		List<Integer> pref8 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof8 = new Professor("8", 3, 7, 13, 28);
		pref8.set(prof8.getPreferencia1(), 1);
		pref8.set(prof8.getPreferencia2(), 1);
		pref8.set(prof8.getPreferencia3(), 1);
		pref8.set(prof8.getPreferencia4(), 1);
		preferences.add(pref8);
		professores.add(prof8);

		List<Integer> pref9 = Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		Professor prof9 = new Professor("9", 1, 2, 3, 24);
		pref9.set(prof9.getPreferencia1(), 1);
		pref9.set(prof9.getPreferencia2(), 1);
		pref9.set(prof9.getPreferencia3(), 1);
		pref9.set(prof9.getPreferencia4(), 1);
		preferences.add(pref9);
		professores.add(prof9);
		
		ProfessorDAO profDAO = new ProfessorDAO();
		for (Professor prof : professores) {
			profDAO.insert(prof);
		}
		
		List<ProfessorHorarioSala> list = scheduler.schedule(professores, preferences, sala);
		profHorarioSala.savebatch(list);
		
	}
}
