package Array;

public class Array 
{

	public static void main(String[] args) 
	{
		int a[]= new int[3];
		
		a[0]=10;
		a[1]=20;
		a[1]=30;
		System.out.println("a[0]"+a[0]+" a[1]" +a[1]+" a[2]" +a[2]);
		
		int b[]= {1,2,3,4,5};
				
		//System.out.println("b[0]"+b[0]+" b[1]" +b[1]+" b[2]" +b[2]+"b[3]" +b[3]"+ b[4] "+b[4]"+b[5] "b+[5"]);
		for(int i=0;i<5;i++) 
		{
			System.out.println(b[i]);
		}
	}

}
