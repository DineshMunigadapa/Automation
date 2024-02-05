package PatternPrograms;

public class PrintPattern_1 {

	public static void main(String[] args) {

		/*
		 *                         1
		 *                        2 2
		 *                       3 3 3
		 *                      4 4 4 4
		 *                     5 5 5 5 5
		 *                    6 6 6 6 6 6
		 *                   7 7 7 7 7 7 7
		 *                  8 8 8 8 8 8 8 8
		 *                 9 9 9 9 9 9 9 9 9
		 * 
		 */
		
		int rows=9;
		int n=9;
		for(int i=1;i<=rows;i++)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			n--;
		}
	}

}
