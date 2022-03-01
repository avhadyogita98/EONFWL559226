package ExceptionHandling;

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
		
	}
}
	class Sonal extends Exception
	{
		public Sonal (String msg)
		{
			super(msg);
		}
	}

public class ExceptionHandling2
{
	int age;
	
	public void checkAge(int age)throws MyException
	{
		if(age<0)
		{
			MyException m1=new MyException("Age must greater than zero");
			throw m1;
		}
		else
		{
			System.out.println("Age is greater than zero");
		}
	}
	public void checkAge(String nm)throws Sonal
	{
		if(nm!="Sonal")
		{
			throw new Sonal("Name should be Sonal");
		}
		else
		{
			System.out.println("name is right");
		}
	}
	
	public static void main(String[] args)
	{
		
		ExceptionHandling2 obj=new ExceptionHandling2();
		
		try
		{
			obj.checkAge(3);
			
		}
		 catch(Exception e)
		{
			 System.out.println("Exception occured"+e);
			 e.printStackTrace();
			 
		}
	}

}
