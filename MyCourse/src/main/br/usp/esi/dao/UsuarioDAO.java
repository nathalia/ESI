package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Usuario;

import org.hibernate.Query;


public class UsuarioDAO extends EntityDAO{
	public List<Usuario> getAll(){
		session.beginTransaction();
		List<Usuario> usuarios = null;
		String SQL = "SELECT user_id, nome, numeroUSP, senha, tipoUsuario FROM usuario";
		
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
