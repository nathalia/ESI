package main.br.usp.esi.factory;

import java.util.List;

import main.br.usp.esi.entities.Usuario;

import org.hibernate.Query;
import org.hibernate.Session;


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
