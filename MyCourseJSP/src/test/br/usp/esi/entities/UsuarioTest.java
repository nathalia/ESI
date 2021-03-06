package test.br.usp.esi.entities;

import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.CursoService;
import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.CursoServiceImpl;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;

public class UsuarioTest extends TestCase{
	private UsuarioService userService = new UsuarioServiceImpl();
	private CursoService cursoService = new CursoServiceImpl();

	public void testInsereUsuario(){
		Usuario userIni = new Usuario();
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
		
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		userService.saveUsuario(userIni);

		List<Usuario> lista = userService.listAll();
		assertTrue(lista.contains(userIni));
	}
	
	public void testAlterUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		userIni.setNome("tester2");
		userIni.setUser("username2");
		userIni.setSenha("senha2");
		userIni.setNumeroUSP(15);
		Usuario userRetornado = userService.saveUsuario(userIni);
		userRetornado.setNome("novoNome");
		Usuario userUpdate = userService.updateUsuario(userRetornado);
		
		assertEquals(userRetornado.getNome(), userUpdate.getNome());
	}
	
	public void testFindUsuario(){
		Usuario userIni = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
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
		
		userIni.setNome("tester");
		userIni.setUser("username");
		userIni.setSenha("senha");
		userIni.setNumeroUSP(1);
		userService.saveUsuario(userIni);
		
		assertEquals(userIni, userService.deleteUsuario(userIni));
	}
	
	public void testHasUser(){
		Usuario usuario = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		usuario.setNome("tester");
		usuario.setUser("username");
		usuario.setSenha("senha");
		usuario.setNumeroUSP(1);
		
		Usuario userRetornado = userService.saveUsuario(usuario);
		
		assertTrue(userService.hasUser(userRetornado));
	}
	
	public void testAutenticarUser(){
		Usuario usuario = new Usuario();
		Curso curso = new Curso();
		curso.setNome("SI");
		curso.setDescricao("desc");
		cursoService.saveCurso(curso);
		
		usuario.setNome("tester");
		usuario.setUser("username");
		usuario.setSenha("senha");
		usuario.setNumeroUSP(1);
		
		assertTrue(userService.autenticarUsuario(usuario.getUser(), usuario.getSenha()));
	}
}
