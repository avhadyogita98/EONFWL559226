package Array;

import java.util.Arrays;

public class ArrayReturn
{
	public String[] batch()
	{
		String names[] = {"Sonal","Dipti","Renuka","Bhakti","Mayur"};
		
		return names;
	}
	
	public static void main(String[] args) 
	{
		ArrayReturn obj= new ArrayReturn();
		
		System.out.println(Arrays.toString(obj.batch()));
	}

}
