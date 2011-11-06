package test.br.usp.esi.entities;

import java.util.Date;
import java.util.List;

import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Disciplina;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.entities.Grade;
import main.br.usp.esi.entities.HorarioAula;
import main.br.usp.esi.service.CursoService;
import main.br.usp.esi.service.DisciplinaHorarioAulaService;
import main.br.usp.esi.service.DisciplinaService;
import main.br.usp.esi.service.GradeService;
import main.br.usp.esi.service.HorarioAulaService;
import main.br.usp.esi.service.impl.CursoServiceImpl;
import main.br.usp.esi.service.impl.DisciplinaHorarioAulaServiceImpl;
import main.br.usp.esi.service.impl.DisciplinaServiceImpl;
import main.br.usp.esi.service.impl.GradeServiceImpl;
import main.br.usp.esi.service.impl.HorarioAulaServiceImpl;
import junit.framework.TestCase;

public class DisciplinaHorarioAulaTeste extends TestCase {
	private DisciplinaHorarioAulaService discHorarioAulaService = new DisciplinaHorarioAulaServiceImpl();
	private DisciplinaService disciplinaService = new DisciplinaServiceImpl();
	private CursoService cursoService = new CursoServiceImpl();
	private HorarioAulaService horarioAulaService = new HorarioAulaServiceImpl();
	private GradeService gradeService =  new GradeServiceImpl();
	
	public void testInsereDisciplinaHorarioAula(){
//		DisciplinaHorarioAula discHorarioAula = new DisciplinaHorarioAula();
//		discHorarioAula.setData(new Date());
//		
//		Disciplina disciplina = new Disciplina();
//		disciplina.setCargaHoraria(30);
//		disciplina.setCodigo(2);
//		disciplina.setCreditosAula(2);
//		
//		Curso curso = new Curso();
//		curso.setNome("SI");
//		curso.setDescricao("desc");
//		cursoService.saveCurso(curso);
//		
//		disciplina.setCurso(curso);
//		disciplina.setDescricao("desc");
//		disciplina.setNome("IA");
//		disciplina.setPeriodoIdeal(30);
//		disciplinaService.saveDisciplina(disciplina);
//		
//		discHorarioAula.setDisciplina(disciplina);
//		
//		HorarioAula horarioAula = new HorarioAula();
//		horarioAula.setHoraInicio(2);
//		horarioAula.setHoraFim(5);
//		Grade grade = new Grade();
//		grade.setNomePeriodo("manhã");
//		gradeService.saveGrade(grade);
//		horarioAula.setGrade(grade);
//		horarioAulaService.saveHorarioAula(horarioAula);
//		discHorarioAula.setHorarioAula(horarioAula);
//		DisciplinaHorarioAula discSalva = discHorarioAulaService.saveDisciplinaHorarioAula(discHorarioAula);
//		System.out.println(horarioAula.getId()+ " horario");
//		System.out.println(discSalva.getId()+ " discSalva");
//		
		//assertEquals(discSalva.getData(), discHorarioAula.getData());
	}
	
	public void testSelectAllDisciplinaHorarioAula(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		List<Curso> lista = cursoService.listAll();
		assertTrue(lista.contains(curso));
	}
	
	public void testAlterCurso(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		Curso cursoSalvo = cursoService.saveCurso(curso);
		cursoSalvo.setNome("SI2");
		Curso cursoUpdate = cursoService.updateCurso(cursoSalvo);
		
		assertEquals(cursoSalvo, cursoUpdate);
	}
	
	public void testFindCurso(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		Curso cursoRetornado = cursoService.saveCurso(curso);
		Curso cursoFind = cursoService.getCurso(cursoRetornado.getId());
		assertEquals(cursoRetornado.getNome(), cursoFind.getNome());
	}
	
	public void testDeleteCurso(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		assertEquals(curso, cursoService.deleteCurso(curso));
	}
}
