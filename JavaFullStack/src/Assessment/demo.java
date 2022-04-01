package Assessment;

public class demo 

{
	class Base
	{
		Base(int var)
		{
		System.out.println("Base");
	}
}
	class Derived extends Base
	{
		
	Derived(int var) 
	{
			super(var);
			// TODO Auto-generated constructor stub
		}

	public void main(String[] args) 
	{
		Derived obj = new Derived(0);
	}

	}
}
