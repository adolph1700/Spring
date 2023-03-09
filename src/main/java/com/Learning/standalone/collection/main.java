package com.Learning.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/Learning/standalone/collection/alone.xml");
		person p=(person) con.getBean("person1");
//		System.out.println(p.Name);
		System.out.println(p.getName().getClass());
		System.out.println(p.getFeestructure().getClass());
		System.out.println(p.getFeestructure().getClass());
		System.out.println(p.getProperty().getClass());
	}

}
