package br.usp.esi.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.usp.esi.entities.Usuario;

public class UsuarioDAO {
	public Usuario save(Usuario usuario){
		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory factory = ac.buildSessionFactory();
		Session session = factory.openSession();
		
		session.persist(usuario);
		session.getTransaction().commit();
		
		return usuario;
	}
}
