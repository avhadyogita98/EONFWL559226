package Array;

public class TwoDimentional
{
	
	public static void main(String[] args) 
	{
		int[] [] ar=new int [3] [2];
		ar[0] [0]=1;
		ar[0] [1]=2;
		
		ar[1] [0]=4;
		ar[1] [1]=5;
		
		ar[2] [0]=7;
		ar[2] [1]=8;
		
		for (int i=0;i<ar.length;i++)
		{
			for (int j=0; j<ar[i].length; j++)
			{
				System.out.println(ar[i] [j]+" ");
			}
			System.out.println("\n ");
		}
		
	}
	
}

