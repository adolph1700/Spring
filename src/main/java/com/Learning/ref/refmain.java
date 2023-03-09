package com.Learning.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/Learning/ref/config.xml");
		courses cor=(courses) con.getBean("course1");
		student stud=(student) con.getBean("student1");
		System.out.println(stud.getCor().getCname());
		System.out.println(stud);
		System.out.println(cor);
		
	}

}
