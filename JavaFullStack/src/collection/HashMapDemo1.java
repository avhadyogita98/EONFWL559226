package collection;

import java.util.HashMap;

public class HashMapDemo1
{

	public static void main(String[] args) 
	{
		HashMap<String,String>map = new HashMap<String,String>();
		
			map.put("Bhakti","155");
			map.put("Renuka","200");
			map.put("Renuka","205");
			map.put("Renuka","201");
			
			System.out.println("Name: " +map.get("Bhakti"));
			System.out.println("Name: " +map.get("Renuka"));
			System.out.println("Name: " +map.get("Renuka"));
			System.out.println("Name: " +map.get("Renuka"));
	}

}
