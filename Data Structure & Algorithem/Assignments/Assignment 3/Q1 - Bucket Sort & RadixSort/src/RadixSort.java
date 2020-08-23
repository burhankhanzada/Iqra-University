class RadixSort {

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    // Main function to implement radix sort
    static void radixSort(int[] array, int base) {

        int max = getMax(array);
        int size = array.length;

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= base)
            countingSort(array, size, max, 10, place);
    }

    static void countingSort(int[] array, int size, int max, int base, int place) {

        // create array to the of maximum number appear in array with plus 1 because of 0 range
        int[] count = new int[base];

        // store no of time a number appear in array and increment that index value
        for (int i = 0; i < size; i++) {
            ++count[(array[i] / place) % base];
        }

        // replace count values for actual range of number indexes of array
        for (int i = 1; i < base; i++) {
            count[i] += count[i - 1];
        }

        int[] sortedArray = new int[size];

        // store values from orginal array according to the count position number
        for (int i = size - 1; i >= 0; i--) {
            sortedArray[--count[(array[i] / place) % base]] = array[i];
        }

        for (int i = 0; i < size; i++) {
            array[i] = sortedArray[i];
        }

    }

}
