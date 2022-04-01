package com.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonMain 
{

	public static void main(String[] args) 
	{
		 System.out.println( "Hello World!" );
	        
	       
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			System.out.println("Hello");
			
			SessionFactory sf=config.buildSessionFactory();
			
			Session session = sf.openSession();
			Transaction tf = session.beginTransaction();
			
			Person p= new Person();
			p.setPid(11);
			p.setPname("Yogita");
			p.setEmail("avhadyogita17@gmail.com");
			
			
		//	p.setPid(22);
		//	p.setPname("Arnav");
		//	p.setEmail("avhadarnav10@gmail.com");
			
			session.saveOrUpdate(p);
			
			tf.commit();
			
			
	}

}
