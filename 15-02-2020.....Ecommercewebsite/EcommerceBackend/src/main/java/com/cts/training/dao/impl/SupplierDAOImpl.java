package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.SupplierDAO;
import com.cts.training.model.Supplier;
@Transactional
@Repository(value = "supplierDAO")
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addOrUpdate(Supplier supplier) {
		try 
		{
		
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}

	}

	public boolean deleteSupplier(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public Supplier getSupplierById(int id) 
	{
		try 
		{
			return sessionFactory.getCurrentSession().get(Supplier.class, id);
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}	

	}

	public List<Supplier> getAllSuppliers() 
	{
		try 
		{
			return sessionFactory.getCurrentSession().createQuery("FROM Supplier").list();
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}

	}
	
}