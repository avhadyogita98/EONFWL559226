package collection;

import java.util.Hashtable;

public class HashTableDemo 
{

	public static void main(String[] args)
	{
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		ht.put("one",1);
		ht.put("Two",2);
		ht.put("Three",3);	
		ht.put("Four",4);
		ht.put("Five",5);
		
		System.out.println(ht.get("one"));
		System.out.println(ht.get("Two"));
		System.out.println(ht.get("Three"));
		System.out.println(ht.get("Four"));
		System.out.println(ht.get("Five"));
		
		
		
		
	}

}