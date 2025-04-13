public class MergeSort {
    private void mergeArrays(int[] leftArr, int leftArrSize, int rightArr, int rightArrSize, int[] tmpArr)
    {
        int i=0, j=0, k=0;

        while (i<leftArrSize && j<rightArrSize)
        {
            if(leftArr[i] < leftArr[rightArr])
            {
                tmpArr[k] = leftArr[i];
                i++;
                k++;
            }
            else
            {
                tmpArr[k] = leftArr[j];
                j++;
                k++;
            }
        }
        while(i < leftArrSize)
        {
            tmpArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArrSize)
        {
            tmpArr[k] = leftArr[j];
            j++;
            k++;
        }
    }

    private void mergeSortRec(int[] array, int size, int[] tmp)
    {
        int i;
        int mid = array.length/2;

        if(array.length > 1)
        {
            mergeSortRec(array, mid, tmp);
            mergeSortRec(array, size-mid, tmp);

            mergeArrays(array, mid, mid+1, size-mid, tmp);
        }
        for(i=0; i<size; i++)
        {
            array[i] = tmp[i];
        }
    }

    public void merge(int[] array, int size)
    {
        int[] tmpArray = new int[size];

        mergeSortRec(array, size, tmpArray);
    }
}
