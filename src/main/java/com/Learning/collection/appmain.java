package com.Learning.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/Learning/collection/collectionconfig.xml");
		Emp emp1=(Emp) context.getBean("Emp1");
		System.out.println(emp1);
		System.out.println(emp1.getName());
	}

}
