public class MergeSort {

    void sort(int[] arr) {

        int startIndex = 0, endIndex = arr.length - 1;

        sort(arr, startIndex, endIndex);

    }

    void sort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            // find middle index
            int middleIndex = (startIndex + endIndex) / 2;

            // sort first both halves
            sort(arr, startIndex, middleIndex);
            sort(arr, middleIndex + 1, endIndex);

            // merge both sorted halves array
            merge(arr, startIndex, middleIndex, endIndex);

        }

    }

    void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {

        // find sizes of both halves
        int sizeOfFirstHalf = middleIndex - startIndex + 1;
        int sizeOfSecondHalf = endIndex - middleIndex;

        // store data in temporary subarray
        int[] arrFirstHalf = new int[sizeOfFirstHalf];
        int[] arrSecondHalf = new int[sizeOfSecondHalf];

        // copy data for first half from main array
        for (int i = 0; i < sizeOfFirstHalf; ++i)
            arrFirstHalf[i] = arr[startIndex + i];

        // copy data for second half from main array
        for (int j = 0; j < sizeOfSecondHalf; ++j)
            arrSecondHalf[j] = arr[middleIndex + 1 + j];

        // initial indexes of first and second subarrays
        int i = 0, j = 0;

        // initial index of merged subarray
        int k = startIndex;

        while (i < sizeOfFirstHalf && j < sizeOfSecondHalf)
        {
            // swapping main array data
            if (arrFirstHalf[i] <= arrSecondHalf[j])
            {
                arr[k] = arrFirstHalf[i];
                i++;
            }
            else
            {
                arr[k] = arrSecondHalf[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of arrFirstHalf[] if any
        while (i < sizeOfFirstHalf)
        {
            arr[k] = arrFirstHalf[i];
            i++;
            k++;
        }

        // copy remaining elements of arrSecondHalf[] if any
        while (j < sizeOfSecondHalf)
        {
            arr[k] = arrSecondHalf[j];
            j++;
            k++;
        }

    }

}
