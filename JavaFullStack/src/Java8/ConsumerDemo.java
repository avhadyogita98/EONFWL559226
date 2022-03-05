package Java8;

import java.util.function.Consumer;

public class ConsumerDemo 
{

	public static void main(String[] args)
	{
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Hello World");
		
		// Consumer<Integer> con = s -> System.out.println(s);
		//con.accept(12+13);
	}

}
