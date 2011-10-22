package main.br.usp.esi.dao;

import java.io.Serializable;
import java.util.List;

import main.br.usp.esi.factory.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class EntityDAO {
	protected Session session;

	public EntityDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	public Object insert(Object obj) {
		Object rObj = null;
		try {
			session.beginTransaction();
			try {
				rObj = getEntity(obj.getClass(), session.save(obj));
			} catch (Exception e) {
				session.beginTransaction().rollback();
				return null;
			}
			session.beginTransaction().commit();
			return rObj;
		} catch (Exception e) {
			return null;
		}
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
	
	public Object getEntity(@SuppressWarnings("rawtypes") Class classe, Serializable serializable){
		return session.get(classe, serializable);
	}
	
	public List findAll(Class clazz) {
        List objects = null;
        try {
        	session.beginTransaction();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            session.beginTransaction().commit();
        } catch (HibernateException e) {
        	session.beginTransaction().rollback();
        	return null;
        } 
        return objects;
    }
	
	public Object find(Class clazz, int id) {
        Object obj = null;
        try {
        	session.beginTransaction();
            obj = session.load(clazz, id);
            session.beginTransaction().commit();
        } catch (HibernateException e) {
        	session.beginTransaction().rollback();
        	return null;
        } 
        return obj;
    }
}
