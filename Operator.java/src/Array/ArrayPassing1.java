package Array;

public class ArrayPassing1
{
	public static void print(int[]array)
	{
		for (int i = 0; i<array.length;i++)
		{
			System.out.println(array[i]+"");
			
		}
	}
	public static void main(String[] args) 
	{
		int [] data = {10,20,30,40,50,60,70,80,90,100};
		
		print(data);
	
	}
}
