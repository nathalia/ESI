package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.entities.Usuario;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class ProfessorDAO extends EntityDAO{
	public Professor findByName(String name){
		List lista = null;
		String stringQuery = "FROM Professor u fetch all properties where u.nome = '" +name+"'";
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
			return (Professor) lista.get(0);
		}
	}
}
