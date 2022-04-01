package com.Spring_6772;

public class Main 
{

	public static void main(String[] args) 
	
	{
	ApplicationC context = new ClassPathXmlApplicationContext("config.xml");
	
	Student student=context.getBean(Student.class,"stud");
	
	System.out.println(Student);
	
	Student student1=context.getBean(Student.class,"stud2");
	
	
	}

}
