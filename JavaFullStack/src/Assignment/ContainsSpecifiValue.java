package Assignment;

import java.util.Arrays;

public class ContainsSpecifiValue
{

	public static void main(String[] args) 
	{
		String[] strings = { "Apple", "Ball", "Cat", "Dog","Elephant" };
		
			String toFind = "Elephant";
			
			//String toFind = "Fish";
		
		boolean found = Arrays.stream(strings).anyMatch(t ->
		t.equals(toFind));
		
		if (found)
			
			System.out.println(toFind + "String is found.");
		
		else
			
			System.out.println(toFind + "String is not found.");
	}

}
