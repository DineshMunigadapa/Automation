package PatternPrograms;

public class downwardTriangle_with_numbers {

	public static void main(String[] args) {

/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
	int rows=7;
	for(int i=rows;i>0;i--)
	{
		for(int j=i;j>0;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
		
		
		
		
	}

}
