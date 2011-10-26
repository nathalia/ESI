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

public class GradeTest extends TestCase {
	private HorarioAulaService horarioAulaService = new HorarioAulaServiceImpl();
	private GradeService gradeService = new GradeServiceImpl();

	public void testInsereGrade(){
		Grade grade = new Grade();
		grade.setNomePeriodo("matutino");
		List<HorarioAula> horarios = new ArrayList<HorarioAula>();
		grade.setHorarios(horarios);
		Grade gradeSalva = gradeService.saveGrade(grade);
		HorarioAula horarioAula = new HorarioAula();
		horarioAula.setHoraInicio(10);
		horarioAula.setHoraFim(12);
		horarioAula.setGrade(gradeSalva);
		horarioAulaService.saveHorarioAula(horarioAula);
		horarios.add(horarioAula);
		grade.setHorarios(horarios);
		gradeSalva = gradeService.updateGrade(grade);
		assertEquals(gradeSalva.getNomePeriodo(), grade.getNomePeriodo());
	}
	
	public void testFindGrade(){
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
		Grade gradeRetornada = gradeService.getGrade(grade.getId());
		assertEquals(gradeRetornada.getNomePeriodo(), grade.getNomePeriodo());
		
	}
	
	public void testDeleteGrade(){
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
		horarioAulaService.deleteHorarioAula(horarioAula);
		assertEquals(grade.getNomePeriodo(), gradeService.deleteGrade(grade).getNomePeriodo());
		
	}
	
}
