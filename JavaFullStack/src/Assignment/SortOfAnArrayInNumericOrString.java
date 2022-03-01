package Assignment;

import java.util.Arrays;

public class SortOfAnArrayInNumericOrString 
{
	
	public static void main(String[] args)
	{
		int[] array1 = { 888, 444, 333, 555, 777, 999,111,222 };
	
		String[] array2 = { "Sonal", "Gunjan", "Renuka" , "Bhakti" };
		
		System.out.println("Old Numeric Array :  " +
		 Arrays.toString(array1));
		Arrays.parallelSort(array1);
		System.out.println("sorted Numeric Array : " +
		Arrays.toString(array2));
		System.out.println("Sorted String Array : "+
		Arrays.toString(array2));
	}
}