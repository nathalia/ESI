package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Sala;

import org.hibernate.HibernateException;
import org.hibernate.Query;



public class SalaDAO extends EntityDAO{
	public Sala findByNumber(int number){
		List lista = null;
		String stringQuery = "FROM Sala u fetch all properties where u.numeroSala = '" +number+"'";
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
			return (Sala) lista.get(0);
		}
	}
}
