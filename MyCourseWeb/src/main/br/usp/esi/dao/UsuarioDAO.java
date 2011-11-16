package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Usuario;

import org.hibernate.HibernateException;
import org.hibernate.Query;



public class UsuarioDAO extends EntityDAO{
	
	public boolean autenticarUsuario(String username, String senha){
		List lista= null;
		String stringQuery = "FROM Usuario u fetch all properties where u.user ='"+username+"' and u.senha = '"+senha+"'";
		try{
			session.beginTransaction();
            Query query = session.createQuery(stringQuery);
            lista = query.list();
            session.beginTransaction().commit();
        } catch (HibernateException e) {
        	session.beginTransaction().rollback();
        	return false;
        } 
		return !lista.isEmpty();
	}
	
	public Usuario findByUsername(String username){
		List lista = null;
		String stringQuery = "FROM Usuario u fetch all properties where u.user = '" + username+"'";
		try{
			session.beginTransaction();
            Query query = session.createQuery(stringQuery);
            lista = query.list();
            session.beginTransaction().commit();
		}catch (HibernateException e) {
        	session.beginTransaction().rollback();
        	return null;
        } 
		if (lista.isEmpty()){
			return null;
		}
		else{
			return (Usuario) lista.get(0);
		}
	}
}
