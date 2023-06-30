package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;
	
	public static SessionFactory getMySession() {
		if(factory==null)
		{
			factory= new Configuration().configure().buildSessionFactory();
			return factory;
		}
		return factory;
	}
	public static void CloseFactory()
	{
		System.out.println("factory close");
		factory.close();
	}
}
