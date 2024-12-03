#include <iostream>
#include <vector>
#include <ctime>

// Fibonacci - Recursive
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}

// Sorting - Bubble Sort
void bubble_sort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Prime Checking
bool is_prime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

// Test Functions
int main() {
    // Fibonacci
    clock_t start = clock();
    fib(30);
    std::cout << "Fibonacci Time: " << double(clock() - start) / CLOCKS_PER_SEC << " seconds\n";

    // Sorting
    std::vector<int> arr = {64, 34, 25, 12, 22, 11, 90};
    start = clock();
    bubble_sort(arr);
    std::cout << "Bubble Sort Time: " << double(clock() - start) / CLOCKS_PER_SEC << " seconds\n";

    // Prime Checking
    start = clock();
    is_prime(104729);
    std::cout << "Prime Checking Time: " << double(clock() - start) / CLOCKS_PER_SEC << " seconds\n";

    return 0;
}
