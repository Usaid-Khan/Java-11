public class Merging {

    public void merge(int[] a, int[] b, int[] mergeArray)
    {
        int aCount = 0;
		int bCount = 0;
		
		while(aCount < a.length+b.length)
		{
			if(aCount < a.length)
			{
				mergeArray[aCount] = a[aCount];
				aCount++;
			}
			else
			{
				mergeArray[aCount] = b[bCount];
				bCount++;
				aCount++;
			}
		}
    }
}
