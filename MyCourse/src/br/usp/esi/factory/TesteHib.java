package br.usp.esi.factory;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.usp.esi.entities.Usuario;

public class TesteHib {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();

		session.beginTransaction();
		List<Usuario> user = null;

		String SQL = "FROM Usuario ";
		try {
			Query q = session.createQuery(SQL);
			user = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.beginTransaction().commit();
	}

}
