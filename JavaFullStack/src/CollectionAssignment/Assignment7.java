package CollectionAssignment;

import java.util.Vector;

public class Assignment7 
{
	private Vector<Integer> list = new Vector<Integer>();
	
	public Vector<Integer> saveEvenNumbers(int N)
	{
		list = new Vector<Integer> ();
		for (int i = 2; i <=N; i++)
		{
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
		
	}
		public Vector<Integer> printEvenNumbers()
		{
			Vector<Integer> newList = new Vector<Integer>();
			
			for (int item : list)
			{
				newList.add(item * 2);
				System.out.println(item  * 2);
			}
				return newList;
				
		}
		
	public static void main(String[] args) 
	{
		Assignment1 obj = new Assignment1();
		obj.saveEvenNumbers(10);
		obj.printEvenNumbers();
		
	}

}
