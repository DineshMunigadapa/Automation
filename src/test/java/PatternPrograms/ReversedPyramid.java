package PatternPrograms;

public class ReversedPyramid {

	public static void main(String[] args) {
/*
 * 
 *   * * * * * * *
 *    * * * * * *
 *     * * * * *
 *      * * * *
 *       * * *
 *        * *
 *         * 
 * 
 */
		
		int rows=7;
		int n=0;
		for(int i=7;i>0;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			n++;
		}
		
		
		
		
	}

}
