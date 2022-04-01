/* Create an ArrayList which will be able to store only Strings.
 Create a printAll method which will print all the elements using an Interator.*/
 
package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment3
{
	public static void main(String[] args)
	{
		
		ArrayList<String>list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		
		printAll(list);
	}
	
		public static void printAll(List<String> list)
	 {
		 Iterator<String> it = list.iterator();
		 
		 while (it.hasNext())
		 {
			 System.out.println(it.next());
		 }
	 }
		
	}
