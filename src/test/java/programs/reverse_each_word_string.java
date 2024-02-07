package programs;

public class reverse_each_word_string {

	public static void main(String[] args) {

		
		String str="This Program is for each word reversal";
		String[] words=str.split(" ");
		String revstr="";
		for(String word:words)
		{
			String revword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword+=word.charAt(i);
			}
			revstr+=revword+" ";
		}
		System.out.println(revstr);
	}

}
