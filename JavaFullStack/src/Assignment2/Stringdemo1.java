// 1 Write a java program to compare two strings lexicographically,ignoring case differences

package Assignment2;

public class Stringdemo1 
{

	public static void main(String[] args)
	{
		String str1 = "This is exercise";
		String str2 = "This is exercise";
		
		
		System.out.println("String 1: " + str1);
		System.out.println("String 1: " + str2);
		
		// Compare two strings:
		int result = str1.compareToIgnoreCase(str2);
		
		//Display the results of the comparison.
		if (result < 0)
		{
			System.out.println("\"" + str1 + "\""+" is less than " + "\"" + str2 + "\"");
		}
		else //if (result == 0)
		{
			System.out.println("\""+str1 +"\""+"is equal to " + "\"" + str2 +"\"");
		}
		
		
		
		
	}

}
