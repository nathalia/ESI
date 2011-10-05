package br.usp.esi.factory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CriaBanco {
	
	public static void main(String[] args) {
		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();
		

		SchemaExport se = new SchemaExport(ac);
		se.create(true, true);

	}
}
