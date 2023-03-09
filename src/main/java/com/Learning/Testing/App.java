package com.Learning.Testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext coon= new ClassPathXmlApplicationContext("com/Learning/Testing/config.xml");
        Student stud=(Student)coon.getBean("student1");
        Student newstud=(Student) coon.getBean("student2");
        
        System.out.println(stud);
        System.out.println(newstud);
    }
}
