package javastream;

import java.util.Arrays;
import java.util.List;

public class Match1
{

	public static void main(String[] args) 
	{
		List<Integer>num=Arrays.asList(11,55,67,45,85,22);
		//boolean res=num.stream().anyMatch(n->n%2==0);
		boolean res=num.stream().anyMatch(n->n%2==0);
		System.out.println(res);
	}

}
