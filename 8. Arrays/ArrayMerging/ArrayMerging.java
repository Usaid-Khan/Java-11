package ArrayMerging;

import java.util.Arrays;

public class ArrayMerging {

	public static void main(String[] args)
	{
		int[] a = {3, 1, 2};
		int[] b = {6, 4, 5};
		int[] mergeArray = new int[a.length + b.length];

		Merging merging = new Merging();
		merging.merge(a, b, mergeArray);
		System.out.println(Arrays.toString(mergeArray));

		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(mergeArray);
		System.out.println(Arrays.toString(mergeArray));
	}
}
