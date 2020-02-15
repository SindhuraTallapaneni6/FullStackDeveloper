package com.cts.training.dao.impl;
import java.util.List;
import org.hibernate.HibernateException;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cts.training.dao.UserDAO;
import com.cts.training.model.User;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	
	 public boolean deleteUser(User user)
	 {
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public User getUserById(int id) {
		try 
		{
			return sessionFactory.getCurrentSession().get(User.class, id);
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> getAllUsers() {
		try 
		{
			return sessionFactory.getCurrentSession().createQuery("FROM User").list();
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public boolean addOrUpdate(User user)
	{
		try 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

}