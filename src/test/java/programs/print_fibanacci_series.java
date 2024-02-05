package programs;

public class print_fibanacci_series {

	public static void main(String[] args) {

		printFibanacciSeries(10);
		printFibanacciSeries(4);

	}
	
	public static void printFibanacciSeries(int n)
	{
		int a=0;
		int b=1;
		int temp;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=n-1;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+" ");
		}
		System.out.println();

	}

}
