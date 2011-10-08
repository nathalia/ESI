package br.usp.esi.dao;

import java.util.List;

import org.hibernate.Query;

import br.usp.esi.entities.Usuario;

public class UsuarioDAO extends EntityDAO{
	public List<Usuario> getAll(){
		session.beginTransaction();
		List<Usuario> usuarios = null;
		
		String SQL = "FROM usuario ";
		
		try {
			Query q = session.createQuery(SQL);
			usuarios = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return usuarios;
	}
}
