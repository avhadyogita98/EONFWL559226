package CollectionAssignment;

import java.util.ArrayList;

public class Assignment1 
{
	ArrayList<Integer> A1=new ArrayList<Integer>();
	public void saveEvenNumber(int N)
	{
		for(int i=2; i<=N;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
		}
		System.out.println("Even numbers are: "+A1);
		
	}
	
	public void printEvenNumbers()
	{
		ArrayList<Integer>A2=new ArrayList<Integer>();
		
		for(Integer itr:A1)
		{
			A2.add(itr *2);
			
		}
		System.out.println("Second Array is: "+A2);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
