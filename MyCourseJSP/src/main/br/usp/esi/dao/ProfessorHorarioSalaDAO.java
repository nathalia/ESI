package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.ProfessorHorarioSala;

import org.hibernate.HibernateException;
import org.hibernate.Query;


public class ProfessorHorarioSalaDAO extends EntityDAO{
	public ProfessorHorarioSala findByRoom(int roomNumber){
		List lista = null;
		String stringQuery = "FROM ProfessorHorarioSala u fetch all properties where u.sala.numeroSala = '" +roomNumber+"'";
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
			return (ProfessorHorarioSala) lista.get(0);
		}
	}
}
