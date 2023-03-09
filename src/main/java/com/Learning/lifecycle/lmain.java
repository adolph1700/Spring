package com.Learning.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext
				("com/Learning/lifecycle/lconfig.xml");
		phone m=(phone)con.getBean("mi");
		System.out.println(m);
		laptop l =(laptop) con.getBean("acer");
		System.out.println(l);
		con.registerShutdownHook();
		activa a=(activa) con.getBean("activa1");
		System.out.println(a);
	}

}
