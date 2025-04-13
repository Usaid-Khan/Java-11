package Arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		
		int[] c = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(c));
	}

}
