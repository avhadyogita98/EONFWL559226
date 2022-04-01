package com.hibernate.Hibernate_6772;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		System.out.println("Hello");
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tf = session.beginTransaction();
		
		
		  	}
		  

		
		
		
	
		
    }

