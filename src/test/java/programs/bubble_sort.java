package programs;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("==========Before Bubble sort=====");
		System.out.println(Arrays.toString(arr));

		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("==========After Bubble sort=====");
		System.out.println(Arrays.toString(arr));
	}

}
