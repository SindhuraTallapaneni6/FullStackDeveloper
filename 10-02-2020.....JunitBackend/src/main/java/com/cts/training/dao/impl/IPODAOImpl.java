package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cts.training.dao.IPODAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.IPO;

public class IPODAOImpl implements IPODAO {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public boolean addIPO(IPO ipo) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean updateIPO(IPO ipo) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public boolean deleteIPO(IPO ipo) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public IPO getIPOById(int id) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			IPO ipo = session.get(IPO.class, id);
			tx.commit();
			session.close();
			return ipo;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<IPO> getAllIPOs() {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<IPO> ipos = session.createQuery("FROM IPO").list();
			tx.commit();
			session.close();
			return ipos;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
