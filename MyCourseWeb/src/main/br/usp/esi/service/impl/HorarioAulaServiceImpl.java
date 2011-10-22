package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.HorarioAulaDAO;
import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.HorarioAula;
import main.br.usp.esi.service.HorarioAulaService;

public class HorarioAulaServiceImpl implements HorarioAulaService {
	private HorarioAulaDAO horarioAulaDao = new HorarioAulaDAO();
	
	@Override
	public List<HorarioAula> listAll() {
		return horarioAulaDao.findAll(HorarioAula.class);
	}

	@Override
	public HorarioAula getHorarioAula(Integer id) {
		return (HorarioAula)horarioAulaDao.find(HorarioAula.class, id);
	}

	@Override
	public HorarioAula saveHorarioAula(HorarioAula horarioAula) {
		return (HorarioAula)horarioAulaDao.insert(horarioAula);
	}

	@Override
	public HorarioAula updateHorarioAula(HorarioAula horarioAula) {
		if(horarioAulaDao.delete(horarioAula))
			return horarioAula;
		else
			return null;
	}

	@Override
	public HorarioAula deleteHorarioAula(HorarioAula horarioAula) {
		if(horarioAulaDao.delete(horarioAula))
			return horarioAula;
		else
			return null;
	}

}
