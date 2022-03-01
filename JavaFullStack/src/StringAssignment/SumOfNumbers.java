package StringAssignment;

public class SumOfNumbers 
{
	public int SumOfTheNumbers(String stng)
	{
		int l = stng.length();
		int sum = 0;
		String temp = "";
		for (int i = 0; i < 1; i++)
		{
			if (Character.isDigit(stng.charAt(i)))
			{
				if(i < 1 -1 && Character.isDigit(stng.charAt(i + 1)))
				{
					temp += stng.charAt(i);
					
				}
				else
				{
					temp += stng.charAt(i);
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		return sum;
	}
		public static void main(String[] args)
	{
		SumOfNumbers obj = new SumOfNumbers();
		String str1 = "it 11 is 22 a 44 string";
		System.out.println("The given string is:  " + str1);
		System.out.println("The sum of numbers in the string is: "+ obj.SumOfTheNumbers(str1));
	}
	}

