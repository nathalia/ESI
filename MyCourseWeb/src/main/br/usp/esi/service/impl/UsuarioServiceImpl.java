package main.br.usp.esi.service.impl;

import java.util.List;

import main.br.usp.esi.dao.UsuarioDAO;
import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@Override
	public List<Usuario> listAll() {
		return usuarioDAO.findAll(Usuario.class);
	}

	@Override
	public Usuario getUsuario(Integer id) {
		return (Usuario)usuarioDAO.find(Usuario.class, id);
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return (Usuario)usuarioDAO.insert(usuario);
	}

	@Override
	public Usuario deleteUsuario(Usuario usuario) {
		if (usuarioDAO.delete(usuario))
			return usuario;
		else
			return null;
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		if (usuarioDAO.update(usuario))
			return usuario;
		else
			return null;
	}
}
