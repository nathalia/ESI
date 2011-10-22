package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Espaco;

public interface EspacoService {
	/**
	 * Metodo para retornar uma lista de espacos
	 * 
	 * @return List<Espaco>
	 */
	List<Espaco> listAll();

	/**
	 * Metodo para recuperar um espaco atraves do id
	 * 
	 * @param id
	 * @return Espaco
	 */
	Espaco getEspaco(Integer id);

	/**
	 * Metodo para salvar/atualizar espaco
	 * 
	 * @param espaco
	 * @return Espaco
	 */
	Espaco saveEspaco(Espaco espaco);

	/**
	 * Metodo para excluir um espaco
	 * 
	 * @param espaco
	 * @return Espaco
	 */
	Espaco deleteEspaco(Espaco espaco);
}
