package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Disciplina;

import org.hibernate.Query;


public class DisciplinaDAO extends EntityDAO{
	public List<Disciplina> getAll(){
		session.beginTransaction();
		List<Disciplina> disciplinas = null;
		
		String SQL = "FROM disciplina ";
		
		try {
			Query q = session.createQuery(SQL);
			disciplinas = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return disciplinas;
	}
}
