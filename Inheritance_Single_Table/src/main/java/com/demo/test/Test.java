package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Student;

public class Test {

	public static void main(String[] args) {
//		
		Employee e=new Employee(8,"sid","pune",10,1500);
		Student s =new Student(9,"tarun","delhi","cdac",1000);
		Employee e1=new Employee(4,"sumya","dhule",50,150000);
		Student s1 =new Student(6,"ganu","satara","cdac",100540);
		Configuration cfg = new Configuration();
		cfg.configure();//hibernate.cfg.xml //db mapping 
		SessionFactory factory=cfg.buildSessionFactory();//multiple seesion connection 
		Session sess=factory.openSession();//connection 
		Transaction tr=sess.beginTransaction();
		sess.save(e);
		sess.save(s);
		sess.save(e1);
		sess.save(s1);
		
		tr.commit();
		sess.close();
		factory.close();
		
//		Employee e=sess.get(Employee.class,4);
//		System.out.println(e);
//		tr.commit();
//		sess.close();
//		factory.close();
		
		
	}

}
