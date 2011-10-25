package main.br.usp.esi.service;

import java.util.List;

import main.br.usp.esi.entities.Usuario;

public interface UsuarioService {
	/**
	 * Metodo para retornar uma lista de usuarios
	 * 
	 * @return List<Usuario>
	 */
	List<Usuario> listAll();

	/**
	 * Metodo para recuperar um usuario atraves do id
	 * 
	 * @param id
	 * @return Usuario
	 */
	Usuario getUsuario(Integer id);

	/**
	 * Metodo para salvar usuario
	 * 
	 * @param usuario
	 * @return Usuario
	 */
	Usuario saveUsuario(Usuario usuario);
	
	/**
	 * Metodo para atualizar usuario
	 * 
	 * @param usuario
	 * @return Usuario
	 */
	Usuario updateUsuario(Usuario usuario);

	/**
	 * Metodo para excluir um usuario
	 * 
	 * @param usuario
	 * @return Usuario
	 */
	Usuario deleteUsuario(Usuario usuario);
	/**
	 * Metodo para autenticação de usuario
	 * 
	 * @param usuario, senha
	 * @return Usuario
	 */
	boolean autenticarUsuario(Usuario usuario);
}
