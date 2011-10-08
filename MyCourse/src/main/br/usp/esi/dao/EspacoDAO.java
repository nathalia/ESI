package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Curso;
import main.br.usp.esi.entities.Espaco;

import org.hibernate.Query;


public class EspacoDAO extends EntityDAO{
	public List<Espaco> getAll(){
		session.beginTransaction();
		List<Espaco> espacos = null;
		
		String SQL = "FROM espaco ";
		
		try {
			Query q = session.createQuery(SQL);
			espacos = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return espacos;
	}
}
