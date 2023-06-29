package com.demo.test;



import java.util.HashSet;
import java.util.Set;
import com.demo.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session sess=sf.openSession();
		
		Transaction tr=sess.beginTransaction();
		/*Address a1=new Address(83,"don bosco","mumbai");
		Address a2=new Address(8,"rhgt","pune");
		Set<Address> aset=new HashSet<Address>();
		aset.add(a1);
		aset.add(a2);
		MyUser u1=new MyUser(65,"kunal",aset);
		a1.setMu(u1);
		a2.setMu(u1);
		
		
		
		sess.save(u1);
		sess.save(a1);
		sess.save(a2);
		*/
		
	//	Address a1=sess.get(Address.class,8);
		MyUser s1=sess.get(MyUser.class, 65);
		System.out.println(s1);
		
		
		
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
