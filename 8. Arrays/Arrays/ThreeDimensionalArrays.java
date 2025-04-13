package Arrays;

public class ThreeDimensionalArrays {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][][] array3D = {
				{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12}
				},
				{
					{13, 14, 15, 16},
					{17, 18, 19, 20},
					{21, 22, 23, 24}
				}
		};
		
		for(int i=0; i<array3D.length; i++)
		{
			for(int j=0; j<array3D[i].length; j++)
			{
				for(int k=0; k<array3D[i][j].length; k++)
				{
					System.out.print(array3D[i][j][k] + " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i=array3D.length-1; i>=0; i--)
		{
			for(int j=array3D[i].length-1; j>=0; j--)
			{
				for(int k=array3D[i][j].length-1; k>=0; k--)
				{
					System.out.print(array3D[i][j][k] + " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}
