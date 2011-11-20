package test.br.usp.esi.entities;

import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Disciplina;
import main.br.usp.esi.service.CursoService;
import main.br.usp.esi.service.DisciplinaService;
import main.br.usp.esi.service.impl.CursoServiceImpl;
import main.br.usp.esi.service.impl.DisciplinaServiceImpl;

public class DisciplinaTest extends TestCase {
	
	private DisciplinaService disciplinaService = new DisciplinaServiceImpl();
	private CursoService cursoService = new CursoServiceImpl();

	public void testInsereDisciplina(){
		Disciplina disciplina = new Disciplina();
		disciplina.setCargaHoraria(30);
		disciplina.setCodigo(2);
		disciplina.setCreditosAula(2);
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		disciplina.setCurso(curso);
		
		disciplina.setDescricao("desc");
		disciplina.setNome("IA");
		disciplina.setPeriodoIdeal(30);
		Disciplina discSalvo = disciplinaService.saveDisciplina(disciplina);
		assertEquals(discSalvo.getNome(), disciplina.getNome());
	}
	
	public void testSelectAllDisciplinas(){
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("cáculo I");
		disciplina.setDescricao("desc");
		disciplina.setCargaHoraria(200);
		disciplina.setCodigo(3);
		disciplina.setCreditosAula(4);
		disciplina.setCodigo(8);
		disciplina.setCreditosTrabalho(7);
		disciplina.setPeriodoIdeal(7);
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		disciplina.setCurso(curso);
		
		disciplinaService.saveDisciplina(disciplina);
		
		List<Disciplina> lista = disciplinaService.listAll();
		assertTrue(lista.contains(disciplina));
	}
	
	public void testAlterDisciplina(){
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("cáculo I");
		disciplina.setDescricao("desc");
		disciplina.setCargaHoraria(200);
		disciplina.setCodigo(3);
		disciplina.setCreditosAula(4);
		disciplina.setCodigo(8);
		disciplina.setCreditosTrabalho(7);
		disciplina.setPeriodoIdeal(7);
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		disciplina.setCurso(curso);
		
		Disciplina disciplinaSalva = disciplinaService.saveDisciplina(disciplina);
		disciplinaSalva.setNome("Cálculo II");
		Disciplina disciplinaUpdate = disciplinaService.updateDisciplina(disciplinaSalva);
		
		assertEquals(disciplinaSalva.getNome(), disciplinaUpdate.getNome());
	}
	
	public void testFindDisciplina(){
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("cáculo I");
		disciplina.setDescricao("desc");
		disciplina.setCargaHoraria(200);
		disciplina.setCodigo(3);
		disciplina.setCreditosAula(4);
		disciplina.setCodigo(8);
		disciplina.setCreditosTrabalho(7);
		disciplina.setPeriodoIdeal(7);
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		disciplina.setCurso(curso);
		
		Disciplina disciplinaRetornada = disciplinaService.saveDisciplina(disciplina);
		Disciplina disciplinaFind = disciplinaService.getDisciplina(disciplinaRetornada.getId());
		assertEquals(disciplinaRetornada.getNome(), disciplinaFind.getNome());
	}
	
	public void testDeleteDisciplina(){
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("cáculo I");
		disciplina.setDescricao("desc");
		disciplina.setCargaHoraria(200);
		disciplina.setCodigo(3);
		disciplina.setCreditosAula(4);
		disciplina.setCodigo(8);
		disciplina.setCreditosTrabalho(7);
		disciplina.setPeriodoIdeal(7);
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		disciplina.setCurso(curso);
		
		disciplinaService.saveDisciplina(disciplina);
		assertEquals(disciplina.getNome(), disciplinaService.deleteDisciplina(disciplina).getNome());
	}

}
