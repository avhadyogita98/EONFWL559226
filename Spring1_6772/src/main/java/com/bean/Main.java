package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student1 = (Student) context.getBean("stud1");
		System.out.println(student1);
		
		
		Student student2 = (Student) context.getBean("stud2");
		System.out.println(student2);
		
		
		Student student3 = (Student) context.getBean("stud3");
		System.out.println(student3);

	}

}
