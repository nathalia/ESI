package test.br.usp.esi.entities;

import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.dao.CursoDAO;
import main.br.usp.esi.dao.UsuarioDAO;
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
	
	public void testSelectAllUsuario() throws Exception{
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
		
//		Verificar!
		userIni.setTipoUsuario(TipoUsuario.ALUNO.name());
		
		List<Usuario> lista = userService.listAll();
		assertTrue(lista.contains(userIni));
//		
//		
//		for (Usuario user : lista) {
//			assertEquals(user, userIni);
//		}
	}
	
}
