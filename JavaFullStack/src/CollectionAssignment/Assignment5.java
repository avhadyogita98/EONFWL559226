package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


	class Emp
	{
		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public Emp (int id, String name, String address, Double salary)
		{
			super ();
			this.id = id;
			this.name = name;
			this.salary = salary;
			
			}
		public int getId()
		{
			return id;
			
		}
		@Override
		public String toString()
		{
			return "Employee [id=" + id + ", name= " + name  + ",address=" + address + ", salary=" + salary + "]";
		}
	}
	
	public class Assignment5 
	{
		
		public static void main(String[] args)
	{
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp(101, "Gunjan", "555 street, USA",22000.0));
		
		list.add(new Emp(102, "Kusum", "444 street, UAE",30000.0));
		
		list.add(new Emp(103, "Deepa", "333 street, India",40000.0));
		
		list.add(new Emp(104, "Rupa", "222 street, India",60000.0));
		
		Iterator<Emp> it = list.iterator ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID :");
		int searchId=sc.nextInt();
		
		//int searchId = 101;
		while (it.hasNext())
		{
			Emp emp = it.next ();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
		
	}
	
}
