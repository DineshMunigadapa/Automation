package check_output;

//output: two 
//Method overriding

class parent
{
	public static void print()
	{
		System.out.println("one");
	}
}

class child extends One
{
	public static void print()
	{
		System.out.println("two");
	}
}


public class op_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One one=new Two();
		one.print();
		

	}

}
