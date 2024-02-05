package check_output;

//output : one
// Static methods cannot be overriden
class One
{
	public static void print()
	{
		System.out.println("one");
	}
}

class Two extends One
{
	public static void print()
	{
		System.out.println("two");
	}
}

public class op_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One one=new Two();
		one.print();
		

	}

}
