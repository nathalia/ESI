package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Grade;

import org.hibernate.Query;


public class GradeDAO extends EntityDAO{
	public List<Grade> getAll(){
		session.beginTransaction();
		List<Grade> grades = null;
		
		String SQL = "FROM disciplina ";
		
		try {
			Query q = session.createQuery(SQL);
			grades = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return grades;
	}
}
