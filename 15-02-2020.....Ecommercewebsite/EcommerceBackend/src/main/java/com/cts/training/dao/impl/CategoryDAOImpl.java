package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.CategoryDAO;
import com.cts.training.model.Category;
import com.cts.training.model.Product;
@Transactional
@Repository(value = "categoryDAO")
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addOrUpdate(Category category)
	{
		try 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}	
				
	}

	public boolean deleteCategory(Category category) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public Category getCategoryById(int id) 
	{
		try 
		{
			return sessionFactory.getCurrentSession().get(Category.class, id);
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}	
	}

	public List<Category> getAllCategories() 
	{
		try 
		{
			return sessionFactory.getCurrentSession().createQuery("FROM Category").list();
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}

	}

}
