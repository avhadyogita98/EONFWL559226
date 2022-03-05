package Java8;

import java.util.function.Consumer;

public class Cchaining
{

	public static void main(String[] args) 
	{
		Consumer<String> con = s -> System.out.println(s.toUpperCase());
		Consumer<String> con1 = s -> System.out.println(s.toUpperCase());
		Consumer<String> con2 = s -> System.out.println(s.toUpperCase());
		
		con.andThen(con1).andThen(con2).accept("Hello");
	}

}
