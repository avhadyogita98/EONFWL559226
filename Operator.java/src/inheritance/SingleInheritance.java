package inheritance;
import java.util.*;

class A
{
	int stuID;
	String name;
	Scanner sc=new Scanner(System.in);
	public void input1()
	{
		System.out.println("Enter Student ID");
		stuID=sc.nextInt();
		System.out.println("Enter Student Name");
		name=sc.next();
		}
	public void show1()
	{
		System.out.println("Enter Student ID is "+stuID);
		System.out.println("Enter Student Name is "+ name);
	}
	
}
	class B extends A
	{
		String address,qua;
		Scanner sc=new Scanner(System.in);
		public void input2()
		{
			System.out.println("Enter address: ");
			address=sc.next();
			System.out.println("Enter Qualification: ");
			qua=sc.next();
			
			}
		
		public void show2()
		
		{
			System.out.println("Student address is"+address);
			System.out.println("Student Qualification is"+qua);
		}
		
	}
public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.input1();
		b1.input2();
		
		b1.show1();
		b1.show2();
	}

}
