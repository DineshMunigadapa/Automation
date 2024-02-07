package programs;

public class check_prime_between_numbers_in_descending_order {

	public static void main(String[] args) {

		int min=90;
		int max=220;
		
		while(max>min)
		{
			boolean flag=false;
			for(int i=2;i<max;i++)
			{
				if(max%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(max+" ");
			}
			max--;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
