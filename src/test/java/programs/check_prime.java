package programs;

public class check_prime {

	public static void main(String[] args) {
		
		checkprime(41);
		checkprime(43);
		checkprime(49);
		checkprime(0);
		checkprime(1);





	}
	
	public static void checkprime(int n)
	{
		int count=0;
		if(n==0 || n==1)
		{
			System.out.println("Given number "+n+" is not Prime");

		}
		else
		{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;	
			}
		}
		if(count==2)
		{
			System.out.println("Given number "+n+" is Prime");
		}
		else
		{
			System.out.println("Given number "+n+" is not Prime");
		}
		}
		
	}

}
