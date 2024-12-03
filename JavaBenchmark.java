public class JavaBenchmark {
    // Fibonacci - Recursive
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Sorting - Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Prime Checking
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Test Functions
    public static void main(String[] args) {
        // Fibonacci
        long start = System.nanoTime();
        fib(30);
        System.out.println("Fibonacci Time: " + (System.nanoTime() - start) / 1e9 + " seconds");

        // Sorting
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        start = System.nanoTime();
        bubbleSort(arr);
        System.out.println("Bubble Sort Time: " + (System.nanoTime() - start) / 1e9 + " seconds");

        // Prime Checking
        start = System.nanoTime();
        isPrime(104729);
        System.out.println("Prime Checking Time: " + (System.nanoTime() - start) / 1e9 + " seconds");
    }
}
