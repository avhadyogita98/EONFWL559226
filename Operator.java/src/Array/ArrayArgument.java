package Array;

public class ArrayArgument 

{
	public void display(int arr[])
	{
		for(int i=0; i<arr.length;i++)
			
		{
			System.out.println(arr[i]);
			
		}
		
	}
	
		public static void main(String[] args)
	{
		int marks[] = {10,20,30,40,50,60,70,80,90,100};
		
	 	ArrayArgument obj = new ArrayArgument();
		obj.display(marks);	// calling function
		
	}

}
