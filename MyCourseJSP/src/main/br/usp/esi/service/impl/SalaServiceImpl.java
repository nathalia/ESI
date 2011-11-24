package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.SalaDAO;
import main.br.usp.esi.entities.Sala;
import main.br.usp.esi.service.SalaService;

public class SalaServiceImpl implements SalaService {
	private SalaDAO salaDao = new SalaDAO();
	@Override
	public List<Sala> listAll() {
		return salaDao.findAll(Sala.class);
	}

	@Override
	public Sala getSalaByNumber(int numeroSala) {
		return salaDao.findByNumber(numeroSala);
	}

	@Override
	public Sala getSala(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sala saveSala(Sala sala) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sala updateSala(Sala sala) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sala deleteSala(Sala sala) {
		// TODO Auto-generated method stub
		return null;
	}

}
