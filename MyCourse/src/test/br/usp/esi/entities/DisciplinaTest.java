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
		//ARRUMAR
		disciplina.setDescricao(50);
		disciplina.setNome("IA");
		disciplina.setPeriodoIdeal(30);
		Disciplina discSalvo
		assertEquals(cursoSalvo.getNome(), curso.getNome());
	}
	
	public void testSelectAllCurso(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		List<Curso> lista = cursoService.listAll();
		assertTrue(lista.contains(curso));
	}
	
	public void testAlterUsuario(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		Curso cursoSalvo = cursoService.saveCurso(curso);
		cursoSalvo.setNome("SI2");
		Curso cursoUpdate = cursoService.updateCurso(cursoSalvo);
		
		assertEquals(cursoSalvo, cursoUpdate);
	}
	
	public void testFindUsuario(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		Curso cursoRetornado = cursoService.saveCurso(curso);
		Curso cursoFind = cursoService.getCurso(cursoRetornado.getId());
		assertEquals(cursoRetornado.getNome(), cursoFind.getNome());
	}
	
	public void testDeleteUsuario(){
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		assertEquals(curso, cursoService.deleteCurso(curso));
	}

}
