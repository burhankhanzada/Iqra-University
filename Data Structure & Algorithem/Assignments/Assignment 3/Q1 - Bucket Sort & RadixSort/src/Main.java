import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        float[] floatArray = {
                (float) 0.150,
                (float) 0.12,
                (float) 0.539,
                (float) 0.478,
                (float) 0.147,
                (float) 0.139,
                (float) 0.245,
                (float) 0.99
        };

        MeasureExecutionTime.startMeasuring();

        BucketSort.bucketSort(floatArray, floatArray.length);

        MeasureExecutionTime.printExecutionTime();

        System.out.println(Arrays.toString(floatArray));

        System.out.println();
        System.out.println();

        int[] integerArray = {150, 12, 539, 478, 147, 139, 245, 99};

        MeasureExecutionTime.startMeasuring();

        RadixSort.radixSort(integerArray, 10);

        MeasureExecutionTime.printExecutionTime();

        System.out.println(Arrays.toString(integerArray));

    }

}