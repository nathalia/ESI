package main.br.usp.esi.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class HibernateUtil {

	private static final SessionFactory factory;

	private static AnnotationConfiguration cfg;
	static {
		try {
			// Create the SessionFactory from standard (hibernate.cfg.xml)
			// config file.
			factory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Log the exception.
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}	}

	public static Session getSession() {
		return factory.openSession();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void criaBanco() {

		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);

	}

	public static void main(String[] args) {
		criaBanco();
	}

}
