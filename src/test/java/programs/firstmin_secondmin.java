package programs;

public class firstmin_secondmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,1,78,45,790,345,678,123,889,0};
		int minone=Integer.MAX_VALUE;
		int mintwo=Integer.MAX_VALUE;
		
		for(int n:arr)
		{
			if(minone>n)
			{
				
				mintwo=minone;
				minone=n;
			}
			else if(mintwo>n)
			{
				mintwo=n;
			}
		}
		System.out.println("minone: "+minone);
		System.out.println("mintwo: "+mintwo);

	}

}
