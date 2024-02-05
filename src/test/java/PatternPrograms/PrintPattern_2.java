package PatternPrograms;

public class PrintPattern_2 {

	public static void main(String[] args) {

		/*
		 *                      1
		 *                     1 2
		 *                    1 2 3
		 *                   1 2 3 4
		 *                  1 2 3 4 5
		 *                 1 2 3 4 5 6
		 *                1 2 3 4 5 6 7
		 *               1 2 3 4 5 6 7 8
		 *              1 2 3 4 5 6 7 8 9
		 * 
		 */
		
		int rows=9;
		int n=9;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			n--;
		}
		
	}

}
