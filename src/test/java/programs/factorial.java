package programs;

public class factorial {
	
	public static void findFactorial(int num)
	{
		if(num==1 || num==0)
		{
			System.out.println("Factorial of number "+num+" is: 1");

		}
		else if(num<0)
			System.out.println("Invalid number");
		else
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact*=i;
			}
			System.out.println("Factorial of number "+num+" is: "+fact);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFactorial(1);
		findFactorial(-1);
		findFactorial(0);
		findFactorial(4);


		

	}

}
