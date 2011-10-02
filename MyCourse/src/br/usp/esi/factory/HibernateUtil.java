package br.usp.esi.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class HibernateUtil {

	private static SessionFactory factory;

	private static AnnotationConfiguration cfg;
	static {
		cfg = new AnnotationConfiguration();
		cfg.configure();

		factory = cfg.buildSessionFactory();
	}

	public static Session getSession() {
		return factory.openSession();
	}

	public static void criaBanco() {

		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);

	}

	public static void main(String[] args) {
		criaBanco();
	}

}
