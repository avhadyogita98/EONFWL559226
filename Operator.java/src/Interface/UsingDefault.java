package Interface;

class AAA
{
	public void display()
	{
		System.out.println("This is class method");
	}
 }
 interface StuInfo
 {
	 public default void display()
	 {
		 int r=1;
		 String nm="Sonal";
		 System.out.println("Student roll number "+r+"\nStudent name  "+nm);
	 }
 }
 
public class UsingDefault extends AAA implements StuInfo
{
	public void display()
	{
		super.display();
		StuInfo.super.display();
		int r=1;
		String nm="Sonal";
		System.out.println("Student roll number "+r+"\nStudent name  "+nm);
		StuInfo.super.display();
		}
		
	public static void main(String[] args) 
	{
		UsingDefault u1=new UsingDefault();
		u1.display();
		

	}

}
