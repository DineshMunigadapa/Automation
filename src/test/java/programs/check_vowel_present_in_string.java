package programs;

public class check_vowel_present_in_string {

	public static void main(String[] args) {
		
		checkVowelInString("EllO");
		
		checkVowelInString("bcd");


	}
	
	public static boolean checkVowelInString(String input)
	{
		boolean flag=input.toLowerCase().matches(".*[aeiou].*");
		if(flag)
		{
			System.out.println("Given String "+input+" contain Vowels");
		}
		else
		{
			System.out.println("Given String "+input+" not contain Vowels");

		}
		return flag;
	}

}
