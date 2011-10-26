package main.br.usp.esi.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.br.usp.esi.entities.Usuario;



public class UsuarioDAO extends EntityDAO{
	@PersistenceContext
	EntityManager em;
	
	public boolean autenmticarUsuario(String usuario, String senha){
		//TODO
		return false;
	}
	
	public Usuario findByUser(String username){
		String query = "FROM usuario u fetch all properties where u.user = '" + username+"'";
		return (Usuario) em.createNamedQuery(query).getResultList().get(0);
	}
}
