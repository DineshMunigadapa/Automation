package programs;

public class swap_numbers_without_third_variable {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		System.out.println("Before swapping - Value of a: "+a+ " and Value of b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping - Value of a: "+a+ " and Value of b: "+b);


	}

}
