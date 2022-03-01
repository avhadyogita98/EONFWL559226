package collection;

import java.util.ArrayList;

public class Arraylist 
{

	public static void main(String[] args)
	{
		ArrayList <String> a=new ArrayList<String>();
		a.add("panipuri");
		a.add("pizza");
		a.add("paubaaji");
		a.add("paneer");
		System.out.println("arraylist of a : "+a);
		
		ArrayList <String> b=new ArrayList<String>();
		b.add(new String("1st"));
		b.add(new String("2nd"));
		b.add(new String("3rd"));
		b.add(new String("4rh"));
		
		System.out.println("arraylist of b: "+b);
		
		System.out.println("........................");
		System.out.println("index 0 in 'b' list: "+b. get(0));
	}

}
