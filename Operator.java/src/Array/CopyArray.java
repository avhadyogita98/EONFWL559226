package Array;

import java.util.Arrays;

public class CopyArray 
{

	public static void main(String[] args) 
	{
		int array01[] = {10,20,30,40,50};
		int array02[] = new int[array01.length];
	
		System.arraycopy(array01,  0, array02,  0, array01. length);
		
		System.out.println("Print element of second array is : "+Arrays.toString(array02));
	
	}
}
