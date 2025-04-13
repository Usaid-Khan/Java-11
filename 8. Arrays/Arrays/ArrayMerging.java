package Arrays;

import java.util.Arrays;

public class ArrayMerging {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] mergeArray = new int[a.length + b.length];
		
		for(int i=0; i<a.length; i++)
		{
			mergeArray[i] = a[i];
		}
		for(int j=0; j<b.length; j++)
		{
			mergeArray[j] = b[j];
		}
		
		System.out.println(Arrays.toString(mergeArray));

	}

}
