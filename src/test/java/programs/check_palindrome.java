package programs;

public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPalindrome("madam");
		checkPalindrome("Madam");


	}
	
	public static void checkPalindrome(String input)
	{
		String rev="";
		input=input.toLowerCase();
		String in=input;
		for(int i=input.length()-1;i>=0;i--)
		{
			rev+=input.charAt(i);
		}
		if(rev.equals(in))
		{
			System.out.println("Given String "+in+" is Palindrome");
		}
		else
		{
			System.out.println("Given String "+in+" is not Palindrome");

		}
	}

}
