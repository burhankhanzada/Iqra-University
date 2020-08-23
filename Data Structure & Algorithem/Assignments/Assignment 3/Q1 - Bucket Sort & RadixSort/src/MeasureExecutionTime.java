public class MeasureExecutionTime {

    static long startTime;

    static void startMeasuring() {
        startTime = System.nanoTime();
    }

    static void printExecutionTime() {

        long timeElapsed = System.nanoTime() - startTime;

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);

        System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
    }

}
