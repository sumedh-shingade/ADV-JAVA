package com.demo.test;

import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTwoWayBinding {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Address a1=new Address(54,"abhinav colony","yavatmal", null);
		//Student s1=new Student(32,"sumedh",a1);
		//a1.setS(s1);
		
		Session sess=sf.openSession();
		
		Transaction tr=sess.beginTransaction();
		System.out.println("before");
		Student s=sess.get(Student.class, 32);
		//Student s=sess.load(Student.class, 32);
		System.out.println("after");
		System.out.println(s);
		System.out.println(s.getName());
//		sess.save(a1);
//		sess.save(s1);
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
