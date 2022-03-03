package StringAssignment;

public class FrequenceOfCharacter 
{
	static final int SIZE = 26;
	
	static void printCharWithFreq(String str)
	{
		int n = str.length();
		int [] freq = new int[SIZE];
		
		for (int i = 0; i < n; i++)
		freq[str.charAt(i) - 'a']++;
		for (int i = 0; i < n; i++)
		{
			if (freq[str.charAt(i) - 'a'] !=0)
			{
				System.out.println(str.charAt(i));
				
				System.out.println(freq[str.charAt(i) - 'a'] + " ");
						freq[str.charAt(i) - 'a'] = 0;
			}
		}
				}
	public static void main(String[] args)
	{
		String str = "yogitashantaramavhad";
		
		printCharWithFreq(str);
	}

}