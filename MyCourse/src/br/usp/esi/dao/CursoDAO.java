package br.usp.esi.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.usp.esi.entities.Curso;

public class CursoDAO {
	AnnotationConfiguration ac = new AnnotationConfiguration();
	ac.configure();

	SessionFactory factory = ac.buildSessionFactory();
	Session session = factory.openSession();
	
	public Curso save(Curso crurso){
		
	}
}
