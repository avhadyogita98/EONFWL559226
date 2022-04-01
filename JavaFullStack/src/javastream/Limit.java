package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Limit 
{
	public static Stream<String>limit(Stream<String> str,int range)
	{
		return str.limit(range);
	}
	
	public static void main(String[] args)
	{
		List<String> a=new ArrayList<>();
		a.add("Gunjan");
		a.add("Sonal");
		a.add("Darshan");
		a.add("Shreyas");
		a.add("Rupa");
		Stream<String>str=a.stream();
		Stream<String>limit=limit(str,4);
		limit.forEach(x->System.out.println(x));

	}

}
