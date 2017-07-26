package com.atos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertUser {

	public static boolean InsertUserDetails(User u1) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		// User p1=new User("xyz@abc.com","password1","xyz","pqr","9987517721");
		session.persist(u1); //stores in database
		tx.commit();
		System.out.println("object save successfully");
		session.close();
		sf.close();
		return true;

	}

}