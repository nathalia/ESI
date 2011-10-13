package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.EspacoDAO;
import main.br.usp.esi.entities.Espaco;
import main.br.usp.esi.service.EspacoService;

public class EspacoServiceImpl implements EspacoService {
	private EspacoDAO espacoDAO = new EspacoDAO();
	
	@Override
	public List<Espaco> listAll() {
		return espacoDAO.findAll(Espaco.class);
	}

	@Override
	public Espaco getEspaco(Integer id) {
		return (Espaco)espacoDAO.find(Espaco.class, id);
	}

	@Override
	public Espaco saveEspaco(Espaco espaco) {
		return (Espaco)espacoDAO.insert(espaco);
	}

	@Override
	public Espaco deleteEspaco(Espaco espaco) {
		if (espacoDAO.delete(espaco))
			return espaco;
		else
			return null;
	}

}
