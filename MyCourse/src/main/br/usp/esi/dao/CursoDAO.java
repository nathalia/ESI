package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Curso;

import org.hibernate.Query;


public class CursoDAO extends EntityDAO {
	public List<Curso> getAll(){
		session.beginTransaction();
		List<Curso> cursos = null;
		
		String SQL = "FROM curso ";
		
		try {
			Query q = session.createQuery(SQL);
			cursos = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return cursos;
	}
}
