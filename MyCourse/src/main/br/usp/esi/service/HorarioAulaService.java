package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.HorarioAula;

public interface HorarioAulaService {
	/**
	 * Metodo para retornar uma lista de HorarioAula
	 * 
	 * @return List<HorarioAula>
	 */
	List<HorarioAula> listAll();

	/**
	 * Metodo para recuperar um HorarioAula atraves do id
	 * 
	 * @param id
	 * @return HorarioAula
	 */
	HorarioAula getHorarioAula(Integer id);

	/**
	 * Metodo para salvar HorarioAula
	 * 
	 * @param horarioAula
	 * @return HorarioAula
	 */
	HorarioAula saveHorarioAula(HorarioAula horarioAula);
	
	/**
	 * Metodo para atualizar horarioAula
	 * 
	 * @param horarioAula
	 * @return HorarioAula
	 */
	HorarioAula updateHorarioAula(HorarioAula horarioAula);

	/**
	 * Metodo para excluir um horarioAula
	 * 
	 * @param horarioAula
	 * @return HorarioAula
	 */
	HorarioAula deleteHorarioAula(HorarioAula horarioAula);
}
