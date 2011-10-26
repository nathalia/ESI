package test.br.usp.esi.entities;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.entities.Grade;
import main.br.usp.esi.entities.HorarioAula;
import main.br.usp.esi.service.GradeService;
import main.br.usp.esi.service.HorarioAulaService;
import main.br.usp.esi.service.impl.GradeServiceImpl;
import main.br.usp.esi.service.impl.HorarioAulaServiceImpl;

public class HorarioAulaTest extends TestCase {
	private HorarioAulaService horarioAulaService = new HorarioAulaServiceImpl();
	private GradeService gradeService = new GradeServiceImpl();

	public void testInsereHorarioAula(){
		Grade grade = new Grade();
		grade.setNomePeriodo("matutino");
		List<HorarioAula> horarios = new ArrayList<HorarioAula>();
		grade.setHorarios(horarios);
		gradeService.saveGrade(grade);
		HorarioAula horarioAula = new HorarioAula();
		horarioAula.setHoraInicio(10);
		horarioAula.setHoraFim(12);
		horarioAula.setGrade(grade);
		HorarioAula horarioAulaSalvo = horarioAulaService.saveHorarioAula(horarioAula);
		horarios.add(horarioAula);
		grade.setHorarios(horarios);
		gradeService.updateGrade(grade);
		assertEquals(horarioAulaSalvo, horarioAula);
	}

	public void testAlterHorarioAula(){
		Grade grade = new Grade();
		grade.setNomePeriodo("matutino");
		List<HorarioAula> horarios = new ArrayList<HorarioAula>();
		grade.setHorarios(horarios);
		gradeService.saveGrade(grade);
		HorarioAula horarioAula = new HorarioAula();
		horarioAula.setHoraInicio(10);
		horarioAula.setHoraFim(12);
		horarioAula.setGrade(grade);
		horarioAulaService.saveHorarioAula(horarioAula);
		horarios.add(horarioAula);
		grade.setHorarios(horarios);
		horarioAula.setHoraFim(22);
		horarios = new ArrayList<HorarioAula>();
		horarios.add(horarioAula);
		horarioAula = horarioAulaService.updateHorarioAula(horarioAula);
		grade.setHorarios(horarios);
		gradeService.updateGrade(grade);
		System.out.println(horarioAula.getId());
		assertEquals(horarioAulaService.getHorarioAula(horarioAula.getId()).getHoraFim(), 22);
	}
	public void testFindHorarioAula(){
		Grade grade = new Grade();
		grade.setNomePeriodo("matutino");
		List<HorarioAula> horarios = new ArrayList<HorarioAula>();
		grade.setHorarios(horarios);
		gradeService.saveGrade(grade);
		HorarioAula horarioAula = new HorarioAula();
		horarioAula.setHoraInicio(10);
		horarioAula.setHoraFim(12);
		horarioAula.setGrade(grade);
		horarioAulaService.saveHorarioAula(horarioAula);
		horarios.add(horarioAula);
		grade.setHorarios(horarios);
		gradeService.updateGrade(grade);
		HorarioAula horarioAulaRetornado = horarioAulaService.getHorarioAula(horarioAula.getId());
		assertEquals(horarioAulaRetornado, horarioAula);
		
	}
	
	public void testDeleteHorarioAula(){
		Grade grade = new Grade();
		grade.setNomePeriodo("matutino");
		List<HorarioAula> horarios = new ArrayList<HorarioAula>();
		grade.setHorarios(horarios);
		grade = gradeService.saveGrade(grade);
		HorarioAula horarioAula = new HorarioAula();
		horarioAula.setHoraInicio(10);
		horarioAula.setHoraFim(12);
		horarioAula.setGrade(grade);
		horarioAulaService.saveHorarioAula(horarioAula);
		horarios.add(horarioAula);
		grade.setHorarios(horarios);
		gradeService.updateGrade(grade);
		assertEquals(horarioAula, horarioAulaService.deleteHorarioAula(horarioAula));
		gradeService.deleteGrade(grade);
	}
	
}
