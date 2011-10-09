package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Usuario;


public interface CursoService {
	/**
	 * Metodo para retornar uma lista de cursos
	 * 
	 * @return List<Curso>
	 */
	List<Curso> listAll();

	/**
	 * Metodo para recuperar um curso atraves do id
	 * 
	 * @param id
	 * @return Curso
	 */
	Curso getCurso(Integer id);

	/**
	 * Metodo para salvar/atualizar curso
	 * 
	 * @param curso
	 * @return Curso
	 */
	Curso saveCurso(Curso curso);
	
	/**
	 * Metodo para atualizar curso
	 * 
	 * @param curso
	 * @return Curso
	 */
	Curso updateCurso(Curso curso);

	/**
	 * Metodo para excluir um curso
	 * 
	 * @param curso
	 * @return Curso
	 */
	Curso deleteCurso(Curso curso);
}
