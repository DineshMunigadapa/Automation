package programs;

public class firstmax_secondmax_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,1,78,45,790,345,678,123,889};
		int maxone=arr[0];
		int maxtwo=arr[0];
		
		for(int n:arr)
		{
			if(maxone<n)
			{
				maxtwo=maxone;
				maxone=n;
			}
			else if(maxtwo<n)
			{
				maxtwo=n;
				
			}
		}
		System.out.println("maxone: "+maxone);
		System.out.println("maxtwo: "+maxtwo);


	}

}
