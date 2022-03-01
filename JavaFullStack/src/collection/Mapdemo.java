package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Mapdemo
{
	public static void main(String[] args)
	
	{
		Map<String,String> map=new HashMap <String,String>();
		
		map.put("1", "Bhakti");
		map.put("2", "Dipti");
		map.put("3", "Renuka");
		map.put("4", "Sheetal");
		map.put("4", "Gunjan");
		map.put(new String("5"),"Kusum");
		
		System.out.println(map);
		System.out.println(map.get("1"));
		
		System.out.println("keys:"+map.keySet());
		System.out.println("keys:"+map.values());
		boolean b = map.containsKey("1");
		System.out.println(b);
		
		Set set=map.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+ "  "+me.getValue());
		}
	}

}
