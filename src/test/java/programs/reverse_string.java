package programs;

public class reverse_string {

	public static void main(String[] args) {

		String str="Textbook";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println("Reverse of String is: "+rev);
	}

}
