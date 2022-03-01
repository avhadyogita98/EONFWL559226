package StringAssignment;

public class CampareTwoStringLexicographically 
{

	public static void main(String[] args) 
	{ 
		String str1 = "My Name is yogita";
		String str2 = "My Name is yogita";
		
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		
		int result = str1.compareToIgnoreCase(str2);
		
		if (result < 0)
		{
			System.out.println("\"" + str1 + "\"" + " is less than " + "\""+ str2 + "\"");
			
			}
		else if (result == 0)
		{
			System.out.println("\"" + str1 + "\"" + " is queater than " + "\"" + str2 + "\"");
		}
	}

}
