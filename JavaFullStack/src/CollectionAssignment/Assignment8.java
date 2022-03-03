package CollectionAssignment;

import java.util.Iterator;
import java.util.Vector;

class Emp2
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Emp2 (int id, String name, String address, Double salary)
	{
		super ();
		this.id = id;
		this.name = name;
		this.address = address;	
	}
	public int getId()
	{
		return id;
		
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + ", name=" + name + ",  address=" + address + ",  saalary=" + salary + "]";
	}
}

	public class Assignment8 
	{
		public static void main(String[] args) 
		{
			Vector<Emp2> list = new Vector<> ();
			
			list.add(new Emp2 (101,"Gunjan", "333 street, USA",2200.0));
			list.add(new Emp2 (102,"Renuka", "444 street, India",2200.0));
			list.add(new Emp2 (103,"Deepa", "222 street, UAE",2200.0));
			list.add(new Emp2 (104,"Rupa", "111 street, America",2200.0));
			
			Iterator<Emp2> it= list.iterator();
			
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
