package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Team;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Team t2=(Team)ctx.getBean("t1");
		System.out.println(t2);
	//	 ((ClassPathXmlApplicationContext)ctx).close();


	}

}
