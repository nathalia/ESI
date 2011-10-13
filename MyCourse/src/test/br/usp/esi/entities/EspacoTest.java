package test.br.usp.esi.entities;

import java.util.List;

import junit.framework.TestCase;
import main.br.usp.esi.entities.Disciplina;
import main.br.usp.esi.entities.Espaco;
import main.br.usp.esi.enums.TipoEspaco;
import main.br.usp.esi.service.EspacoService;
import main.br.usp.esi.service.impl.EspacoServiceImpl;

public class EspacoTest extends TestCase{
	private EspacoService espacoService = new EspacoServiceImpl();
	
	public void testInsereEspaco(){
		Espaco espaco = new Espaco();
		espaco.setCodigo(1);
		espaco.setLotacaoMax(50);
		espaco.setNome("sala 1");
		espaco.setTipoEspaco(TipoEspaco.SALA);
		
		Espaco espacoSalvo = espacoService.saveEspaco(espaco);
		assertEquals(espacoSalvo.getNome(), espaco.getNome());
	}
	
	public void testSelectAllEspacos(){
		Espaco espaco = new Espaco();
		espaco.setCodigo(1);
		espaco.setLotacaoMax(50);
		espaco.setNome("sala 1");
		espaco.setTipoEspaco(TipoEspaco.SALA);
		espacoService.saveEspaco(espaco);
		
		List<Espaco> lista = espacoService.listAll();
//		assertTrue(lista.contains(espaco));	
	}
}
