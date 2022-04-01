package map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) 
	{
		System.out.println("Hello World ");
		
		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tf = session.beginTransaction();
		
		Employee employee1 = new Employee();
		employee1.setEmpid(1);
		employee1.setEmpName("Yogita");
		
		
		Employee employee2 = new Employee();
		employee2.setEmpid(2);
		employee2.setEmpName("Rahel");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		
		Project project1 = new Project();
		project1.setProjectID(101);
		project1.setProjectName("JAVA");
		project1.setEmployee(empList);
		
		Project project2 = new Project();
		project2.setProjectID(102);
		project2.setProjectName(".NET");
		project2.setEmployee(empList);
		
		
		List<Project> projectList = new ArrayList<Project>();
		projectList.add(project1);
		projectList.add(project2);
		
		employee1.setProject(projectList);
		employee2.setProject(projectList);
		
		session.saveOrUpdate(employee1);
		session.saveOrUpdate(employee2);
	
		
		tf.commit();

	}

}
