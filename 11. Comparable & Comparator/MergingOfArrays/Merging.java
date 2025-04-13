package MergingOfArrays;

public class Merging {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] merge = new int[a.length+b.length];
		
		int aCount = 0;
		int bCount = 0;
		while(aCount < a.length+b.length)
		{
			if(aCount < a.length)
			{
				merge[aCount] = a[aCount];
				aCount++;
			}
			else
			{
				merge[aCount] = b[bCount];
				aCount++;
				bCount++;
			}
		}
		
		/* Printing the Merged Array */
		for(int i=0; i<merge.length; i++)
		{
			System.out.print(merge[i] + " ");
		}
	}
}