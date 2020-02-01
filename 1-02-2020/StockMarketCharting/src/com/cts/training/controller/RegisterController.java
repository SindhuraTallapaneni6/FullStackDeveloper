package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Register;

public class RegisterController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Register user = new Register(101, "sindhura","Tallapaneni","sindhu", "sindhu@gmail.com", "542376","542376", 9789789789L,4532);
		session.save(user);
	}

}
