package test.br.usp.esi.entities;

import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.enums.TipoUsuario;
import main.br.usp.esi.service.CursoService;
import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.CursoServiceImpl;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;

public class UsuarioTest extends TestCase{
	private UsuarioService userService = new UsuarioServiceImpl();
	private CursoService cursoService = new CursoServiceImpl();

	public void testInsereUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setCurso(curso);
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		Usuario usuarioRetornado = userService.saveUsuario(userIni);

		assertEquals(usuarioRetornado.getNumeroUSP(), userIni.getNumeroUSP());
		
	}
	
	public void testSelectAllUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setCurso(curso);
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		userService.saveUsuario(userIni);

		userIni.setTipoUsuario(TipoUsuario.ALUNO.name());
		
		List<Usuario> lista = userService.listAll();
		assertTrue(lista.contains(userIni));
	}
	
	public void testAlterUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setCurso(curso);
		userIni.setNome("tester2");
		userIni.setUser("username2");
		userIni.setSenha("senha2");
		userIni.setNumeroUSP(15);
		Usuario userRetornado = userService.saveUsuario(userIni);
		userRetornado.setNome("novoNome");
		Usuario userUpdate = userService.updateUsuario(userRetornado);
		
		assertEquals(userRetornado, userUpdate);
	}
	
	public void testFindUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setCurso(curso);
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		Usuario userRetornado = userService.saveUsuario(userIni);
		
		Usuario userFind = userService.getUsuario(userRetornado.getId());
		
		assertEquals(userIni.getNumeroUSP(), userFind.getNumeroUSP());
	}
	
	public void testDeleteUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setCurso(curso);
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		userService.saveUsuario(userIni);
		
		assertEquals(userIni, userService.deleteUsuario(userIni));
	}
	
}
