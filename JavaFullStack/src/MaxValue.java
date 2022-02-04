import java.util.Scanner;
public class MaxValue 
{

	public static void main(String[] args)
	{
		int a,b,c;
		int max=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		a=s.nextInt();
		System.out.println("Enter value for b : ");
		b=s.nextInt();
		System.out.println("Enter value for c : ");
		c=s.nextInt();
		if (a>b)
		{
			if(a>c)
				max=a;
			else         //This else is associate with this if (a>c)
				max=c;
		}
		else          //This else is associate with this if(a>b)
		{
			if(b>c)
			
				max=b;
			
			else   //This else is associate with this if(b>c)
			
		max=c;
	}
			System.out.println("\n max value = " + max);
}
	}

