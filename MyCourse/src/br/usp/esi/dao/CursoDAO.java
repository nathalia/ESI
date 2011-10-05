package br.usp.esi.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.usp.esi.entities.Curso;

public class CursoDAO {
	public Curso save(Curso curso){
		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory factory = ac.buildSessionFactory();
		Session session = factory.openSession();
		return curso;
	}
}
