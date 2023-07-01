package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Address;
import com.demo.beans.Player;
import com.demo.beans.Teams;

public class TestFirstSpring {

	public static void main(String[] args) {
		
		/*XmlBeanFactory bf=new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		 System.out.println("before getbean");
		 HelloWorld hbean=(HelloWorld)ctx.getBean("hw");
		 System.out.println("after getbean");
		 hbean.sayHello();
		 */
		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		 //MyUser user=(MyUser)ctx.getBean("u1");
		 //System.out.println(user);
		 
		// Address ad=(Address)ctx.getBean("addr");
		 
		 //System.out.println(ad);
		 Teams t1=(Teams)ctx.getBean("t1");
		// Teams t2=(Teams)ctx.getBean("t2");
		 System.out.println(t1);
		 ((ClassPathXmlApplicationContext)ctx).close();
	}
	

}
