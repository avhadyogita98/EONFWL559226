package Java8;

import java.util.function.Function;

public class Functional 

{
	public static void main(String[] args)
	{
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("Hello"));
		
		Function<String,String> str=s->s.replace('a', 's');
		System.out.println(fun.apply("Sonal"));
	}

}
