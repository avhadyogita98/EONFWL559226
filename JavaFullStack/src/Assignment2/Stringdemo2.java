//2 Write a java program to convert given string in lower and uppercase.

package Assignment2;

import java.util.Scanner;

public class Stringdemo2 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be converted to UpperCase");
		String str = sc.nextLine();
		
		str = str.toUpperCase(); //converts string to uppercase
		System.out.println("String on using toUpperCase() method = "+str);	
		}

}
