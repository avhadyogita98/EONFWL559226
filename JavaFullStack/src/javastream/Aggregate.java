package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	int salary;
	String name;
	 	
	Employee(int empid, int salary, String name)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
		
	}
}

public class Aggregate 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee(1,2000,"gunjan");
		Employee e2=new Employee(2,2000,"gunjan");
		Employee e3=new Employee(3,2000,"gunjan");
		
		List<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		
		//sum
		int totalSal=emp.stream().collect(Collectors.summingInt(a->a.salary));
		System.out.println("sum:"+totalSal);
		
		//max
		Employee max=emp.stream().max((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println("max:"+max.salary);
		
		//min
		Employee min=emp.stream().min((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println("min:"+min.salary);
		
		//count
		long countSalary=emp.stream().filter(a->a.salary>4000).count();
		System.out.println(countSalary);
	}

}
