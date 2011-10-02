package br.usp.esi.factory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

public class ModificaBanco {

	public static void main(String[] args) {
		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();


		SchemaUpdate se = new SchemaUpdate(ac);
		se.execute(true, true);

	}
}
