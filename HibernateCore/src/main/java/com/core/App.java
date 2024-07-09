package com.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		User u = new User(1,"kotlin","ahmedabad",98654);
		session.save(u);
//		session.update(u);
//		session.delete(u);
		
//		User u = session.get(User.class, 2);
//		System.out.println(u);
		tx.commit();
		session.close();
		sf.close();
	}
}
