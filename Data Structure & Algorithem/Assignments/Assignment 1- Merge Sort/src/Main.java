import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {15, 25, 14, 78, 65, 48, 21, 54, 7};

        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));

    }

}
