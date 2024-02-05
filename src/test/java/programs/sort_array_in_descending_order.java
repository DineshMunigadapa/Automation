package programs;

import java.util.Arrays;

public class sort_array_in_descending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] num= {5,2,0,90,91,67,64};
		
		System.out.println("-----------Before Sorting----------------");
		System.out.println(Arrays.toString(num));

		
		int temp;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("-----------After Sorting----------------");
		System.out.println(Arrays.toString(num));


	}

}
