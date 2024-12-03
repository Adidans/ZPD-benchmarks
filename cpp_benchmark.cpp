#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include <chrono>

using namespace std;

vector<int> arr;  // Fixed random array for bubble sort

// Fibonacci function (recursive)
int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Prime checking function
bool is_prime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

// Bubble sort function
void bubble_sort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

int main() {
    // Pre-generate a fixed set of random numbers for consistent benchmarking
    srand(42);  // Set the seed for reproducibility
    for (int i = 0; i < 10000; i++) {
        arr.push_back(rand() % 10000);  // Fixed random array for bubble sort
    }

    // Fibonacci Test (Increased input size)
    auto start = chrono::high_resolution_clock::now();
    fibonacci(40);  // Fibonacci(40)
    auto end = chrono::high_resolution_clock::now();
    chrono::duration<double> fib_duration = end - start;
    cout << "C++ Fibonacci Time: " << fib_duration.count() * 1000 << " ms" << endl;

    // Bubble Sort Test (Increased array size, fixed input)
    start = chrono::high_resolution_clock::now();
    bubble_sort(arr);  // Use pre-generated fixed array
    end = chrono::high_resolution_clock::now();
    chrono::duration<double> bubble_sort_duration = end - start;
    cout << "C++ Bubble Sort Time: " << bubble_sort_duration.count() * 1000 << " ms" << endl;

    // Prime Checking Test (Increased number)
    int num = 104729;  // A larger prime number for testing
    start = chrono::high_resolution_clock::now();
    is_prime(num);
    end = chrono::high_resolution_clock::now();
    chrono::duration<double> prime_duration = end - start;
    cout << "C++ Prime Checking Time: " << prime_duration.count() * 1000 << " ms" << endl;

    return 0;
}
