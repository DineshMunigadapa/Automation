package programs;

public class check_prime_between_numbers_in_ascending_order {

	public static void main(String[] args) {

		
		int min=56;
		int max=98;
		
		while(min<max)
		{
			boolean flag=false;
			for(int i=2;i<min;i++)
			{
				if(min%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(min+" ");
			}
			min++;	
		}
		
		
	}

}
