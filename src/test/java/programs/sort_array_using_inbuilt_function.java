package programs;

import java.util.Arrays;

public class sort_array_using_inbuilt_function {

	public static void main(String[] args) {
		
		int[] num= {5,2,0,90,91,67,64};
		
		System.out.println("--------------Before Sorting-------------");
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("--------------After Sorting-------------");
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));


	}

}
