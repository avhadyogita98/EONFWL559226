/* Create an ArrayList which will be able to store only Strings.
 Create a printAll method which will print all the elements using an Interator.*/
 
package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3
{
	public void showAll(ArrayList list)
	{
		Iterator itr=list.iterator();
		
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args)
	{
		Assignment3 a3=new Assignment3();
		ArrayList<String>list=new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		a3.showAll(list);
	}

}
