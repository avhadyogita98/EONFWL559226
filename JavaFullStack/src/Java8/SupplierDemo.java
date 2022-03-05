package Java8;

import java.util.function.Supplier;

public class SupplierDemo
{

	public static void main(String[] args) 
	
	{
		Supplier<Double> sup=() -> Math.random();
		
		System.out.println(sup.get());
	//	Supplier<String> sup=() -> "Sonal";
	//	System.out.println(sup.get());
	//	int amount=100;
	//	Supplier<Integer> sup=() ->amount+100;
	//	System.out.println(sup.get());
		
		
		//Optional<Double> optionalDouble = Optional.empty();
		//System.out.println(optionalDouble.orElseGet(sup));
		
		//System.out.println(sup.get());
		//double doubleSupplier2 = Math.random();
		
	}

}
