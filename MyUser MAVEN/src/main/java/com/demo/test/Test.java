package com.demo.test;

import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		// 1. create session factory object
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Address a1=new Address(12,"abhinav coloy","yavatmal");
		Student s1=new Student(23,"sumedh",a1);
		
		//2. create session
		
		Session sess=sf.openSession();
		
		//transaction
		
		Transaction tr=sess.beginTransaction();
		
		sess.save(a1);
		sess.save(s1);
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
