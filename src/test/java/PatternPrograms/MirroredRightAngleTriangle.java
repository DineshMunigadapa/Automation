package PatternPrograms;

public class MirroredRightAngleTriangle {

	public static void main(String[] args) {
/*
 *                  *
 *                 **
 *                ***
 *               ****
 *              *****
 *             ******
 *            *******
 *           ********             
 *          *********
 *         ********** 
 * 
 * 
 * 
 */
		
	int rows=10;
	int n=10;
	for(int i=1;i<=rows;i++)
	{
		for(int j=n;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		n--;
		
		
	}
		
		
		
		
		
		
		
		
	}

}
