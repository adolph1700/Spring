package com.Learning.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class automain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/Learning/auto/wire/annotation/autoconfig.xml");
//		Address add = (Address) con.getBean("address");
//		System.out.println(add);
		Emp emp=(Emp) con.getBean("emp1");
		System.out.println(emp);
		

	}

}
