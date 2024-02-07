package programs;

public class first_three_max_array {

	public static void main(String[] args) {
		int[] arr= {4,1,78,45,790,345,678,123,889};
		int maxone=arr[0];
		int maxtwo=arr[0];
		int maxthree=arr[0];
		
		for(int n:arr)
		{
			if(maxone<n)
			{
				maxthree=maxtwo;
				maxtwo=maxone;
				maxone=n;
			}
			else if(maxtwo<n)
			{
				maxthree=maxtwo;
				maxtwo=n;
				
			}
			else if(maxthree<n)
			{
				maxthree=n;
			}
		}
		System.out.println("maxone: "+maxone);
		System.out.println("maxtwo: "+maxtwo);
		System.out.println("maxthree: "+maxthree);



	}

}
