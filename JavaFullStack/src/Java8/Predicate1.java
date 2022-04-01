package Java8;

import java.util.function.Predicate;

public class Predicate1
{

	public static void main(String[] args)
	{
	//	Predicate <Integer>p=t->(t%2==0);
	//	System.out.println(p.test(6));
	//	System.out.println(p.test(5));

//	}
//
	//}
	//and,or,negate
	int[]num= {1,2,3,4,5,6,7,8,9,10};
	Predicate <Integer> even=x->x%2==0;
	Predicate <Integer> numbers=y->y>5;
	for(int i=1;i<num.length;i++)
	{
		// 	1
		//	1 false or false = false
		//	2 false or true = true
		//	if(numbers.or(even.test(i))
			{
				System.out.println(i);
			}
		}
	
	}
	
	}