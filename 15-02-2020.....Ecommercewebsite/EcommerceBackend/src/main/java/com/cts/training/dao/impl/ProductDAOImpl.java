package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.ProductDAO;
import com.cts.training.model.Product;
@Transactional
@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addOrUpdate(Product product) {
		
		try 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}	
		
	}

	public boolean deleteProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public Product getProductById(int id) {
		try 
		{
			return sessionFactory.getCurrentSession().get(Product.class, id);
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}	
	}

	public List<Product> getAllProducts()
	{
		try 
		{
			return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
