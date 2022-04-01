package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1
{

	public static void main(String[] args)
	{
		List<Integer>li=Arrays.asList(2,3,4,5,6,7);
		//List<Integer> ans=li.stream().map(x->x+x).collect(Collectors.tolist());
		List<Integer> even= li.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println(even);
	}

}
