package programs;

public class first_three_min {

	public static void main(String[] args) {
		
		int[] arr= {7,2,4,5,1,-100,0,-55,-101};

		int minone=Integer.MAX_VALUE;
		int mintwo=Integer.MAX_VALUE;
		int minthree=Integer.MAX_VALUE;
		
		for(int n:arr)
		{
			
			if(minone>n)
			{
				minthree=mintwo;
				mintwo=minone;
				minone=n;
			}
			else if(mintwo>n)
			{
				mintwo=minone;
				mintwo=n;
			}
			else if(minthree>n)
			{
				minthree=n;
			}	
		}
		System.out.println("minone: "+minone);
		System.out.println("mintwo: "+mintwo);
		System.out.println("minthree: "+minthree);
		
	}

}
