package main.br.usp.esi.dao;

import java.util.List;

import main.br.usp.esi.entities.Disciplina;
import main.br.usp.esi.entities.DisciplinaHorarioAula;

import org.hibernate.Query;


public class DisciplinaHorarioAulaDAO extends EntityDAO{
	public List<DisciplinaHorarioAula> getAll(){
		session.beginTransaction();
		List<DisciplinaHorarioAula> disciplinaHorarios = null;
		
		String SQL = "FROM disciplina_horario ";
		
		try {
			Query q = session.createQuery(SQL);
			disciplinaHorarios = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
		return disciplinaHorarios;
	}
}
