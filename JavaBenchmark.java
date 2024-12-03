import java.util.ArrayList;
import java.util.Random;

public class JavaBenchmark {

    // Pre-generate a fixed set of random numbers for consistent benchmarking
    static ArrayList<Integer> arr = new ArrayList<>();

    // Fibonacci function (recursive)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Prime checking function
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Bubble sort function
    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Pre-generate a fixed set of random numbers for consistent benchmarking
        Random rand = new Random(42);  // Set the seed for reproducibility
        for (int i = 0; i < 10000; i++) {
            arr.add(rand.nextInt(10000));  // Fixed random array for bubble sort
        }

        // Fibonacci Test (Increased input size)
        long startTime = System.nanoTime();
        fibonacci(40);  // Fibonacci(40)
        long endTime = System.nanoTime();
        long fibDuration = (endTime - startTime) / 1000000;  // Convert to milliseconds
        System.out.println("Java Fibonacci Time: " + fibDuration + " ms");

        // Bubble Sort Test (Increased array size, fixed input)
        startTime = System.nanoTime();
        bubbleSort(arr);  // Use pre-generated fixed array
        endTime = System.nanoTime();
        long bubbleSortDuration = (endTime - startTime) / 1000000;  // Convert to milliseconds
        System.out.println("Java Bubble Sort Time: " + bubbleSortDuration + " ms");

        // Prime Checking Test (Increased number)
        int num = 104729;  // A larger prime number for testing
        startTime = System.nanoTime();
        isPrime(num);
        endTime = System.nanoTime();
        long primeDuration = (endTime - startTime) / 1000000;  // Convert to milliseconds
        System.out.println("Java Prime Checking Time: " + primeDuration + " ms");
    }
}
