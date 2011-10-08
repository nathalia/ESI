package main.br.usp.esi.dao;

import main.br.usp.esi.factory.HibernateUtil;

import org.hibernate.Session;


public class EntityDAO {
	protected Session session;

	public EntityDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	public boolean insert(Object obj) {
		try {
			session.beginTransaction();

			try {
				session.save(obj);
			} catch (Exception e) {
				session.beginTransaction().rollback();
				return false;
			}

			session.beginTransaction().commit();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean delete(Object obj) {
		try {

			session.beginTransaction();
			try {
				session.delete(obj);
			} catch (Exception e) {
				session.beginTransaction().rollback();
				return false;
			}
			session.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean update(Object obj) {
		try {
			session.beginTransaction();
			try {
				session.update(obj);
			} catch (Exception e) {
				session.beginTransaction().rollback();
				return false;
			}
			session.beginTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
