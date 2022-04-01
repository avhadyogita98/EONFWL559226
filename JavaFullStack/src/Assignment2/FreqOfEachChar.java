// 5. Write a Java program to print the frequency of each character in a string
//(welocme in Edubridge family) like w=1, e=4, l=2 etc.

package Assignment2;

import java.util.Scanner;

	public class FreqOfEachChar 
	{	
		private static Scanner sc;
		public static void main(String[] args) 
	{
		
		String freqStr;
		int i = 0, j = 0;
		int[] charFreq = new int[256];
		
		sc= new Scanner(System.in);
		System.out.println("\nPlease Enter String to find Frequency of each Char = ");
		freqStr = sc.nextLine();
		
		while(i < freqStr.length())
		{
			charFreq[freqStr.charAt(i)]++;
			i++;
		}
		while(j < 256)
		{
			if(charFreq[j] !=0)
			{
				System.out.format("\n'%c' Character Occurs %d Times", j, charFreq[j]);
			}
			j++;
		}
	}

}
