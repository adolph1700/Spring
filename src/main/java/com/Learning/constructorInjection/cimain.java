package com.Learning.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cimain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/Learning/constructorInjection/ciconfig.xml");
		Employee emp=(Employee) con.getBean("emp1");
		Certi cer=(Certi) con.getBean("cert1");
		Addition add=(Addition) con.getBean("add1");
		System.out.println(emp);
		System.out.println(cer);
		System.out.println(add);
		

	}

}
