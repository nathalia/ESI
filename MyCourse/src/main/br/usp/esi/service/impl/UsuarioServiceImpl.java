package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.UsuarioDAO;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@Override
	public List<Usuario> listAll() {
		return usuarioDAO.getAll();
	}

	@Override
	public Usuario getUsuario(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		if (usuarioDAO.insert(usuario))
			return usuario;
		else
			return null;
	}

	@Override
	public Usuario deleteUsuario(Usuario usuario) {
		if (usuarioDAO.delete(usuario))
			return usuario;
		else
			return null;
	}

}
