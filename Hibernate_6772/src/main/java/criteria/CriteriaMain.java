package criteria;



import java.util.List;

import javax.swing.text.html.ListView;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
		
		// .........................greater than...................................
		
		Criteria c = session.createCriteria(Employee111.class);
		System.out.println("salary greater than 5000 is: ");
		c.add(Restrictions.gt("salary",5000));
		List list = c.list();
		
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
			
			//..........................less than ......................................
			
			Criteria c1 = session.createCriteria(Employee111.class);
			System.out.println("salary less than 1800 is: ");
			c1.add(Restrictions.lt("salary",1800));
			
			List list1 = c1.list();
			
			for(int i = 0; i<list1.size();i++)
				
			{
				System.out.println(list1.get(i));
			}
			
			//  .........................less than equal.................................
			
			Criteria c2 = session.createCriteria(Employee111.class);
			System.out.println("salary less than equal 2000 is: ");
			c2.add(Restrictions.le("salary",2000));
			
			List list2 = c2.list();
			for(int i = 0; i<list2.size();i++)
			{
				System.out.println(list2.get(i));
			}
			
			//.............................not equal to..........................................
			
			Criteria c3 = session.createCriteria(Employee111.class);
			System.out.println("salary not equal 5000 is: ");
			c2.add(Restrictions.ne("salary",5000));
			
			List list3 = c3.list();
			for(int i = 0; i<list3.size();i++)
			{
				System.out.println(list3.get(i));
			}
			
			// ********************************** using projection performing aggreagate***************************
			Criteria c4 = session.createCriteria(Employee111.class);
			System.out.println("mimimum salary  is: ");
			c4.setProjection(Projections.min("salary"));
			
			List list4 = c4.list();
			for(int i = 0; i<list4.size();i++)
			{
				System.out.println(list4.get(i));
			}
			
	
//		Employee111 obj = new Employee111();
//		obj.setId(1);
//		obj.setName("Gunjan");
//		obj.setSalary(2000);
//		
//		Employee111 obj1 = new Employee111();
//		obj1.setId(2);
//		obj1.setName("Sonal");
//		obj1.setSalary(3000);
//		
//		Employee111 obj2 = new Employee111();
//		obj2.setId(3);
//		obj2.setName("Arnav");
//		obj2.setSalary(4000);
//		
//		
//		Employee111 obj3 = new Employee111();
//		obj3.setId(4);
//		obj3.setName("Renuka");
//		obj3.setSalary(5000);
//		
//	session.saveOrUpdate(obj);
//	session.saveOrUpdate(obj1);
//	session.saveOrUpdate(obj2);
//	session.saveOrUpdate(obj3);
//		
//	tx.commit();
		}

	}
