import time
import random

# Pre-generate a fixed set of random numbers for consistent benchmarking
random.seed(42)  # Set the seed for reproducibility
arr = [random.randint(0, 10000) for _ in range(10000)]  # Fixed random array for bubble sort

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

if __name__ == "__main__":
    # Fibonacci Test (Increased input size)
    start_time = time.time()
    fibonacci(40)  # Fibonacci(40)
    end_time = time.time()
    fib_duration = (end_time - start_time) * 1000  # Convert to milliseconds
    print(f"Python Fibonacci Time: {fib_duration:.2f} ms")

    # Bubble Sort Test (Increased array size, fixed input)
    start_time = time.time()
    bubble_sort(arr)  # Use pre-generated fixed array
    end_time = time.time()
    bubble_sort_duration = (end_time - start_time) * 1000  # Convert to milliseconds
    print(f"Python Bubble Sort Time: {bubble_sort_duration:.2f} ms")

    # Prime Checking Test (Increased number)
    num = 104729  # A larger prime number for testing
    start_time = time.time()
    is_prime(num)
    end_time = time.time()
    prime_duration = (end_time - start_time) * 1000  # Convert to milliseconds
    print(f"Python Prime Checking Time: {prime_duration:.2f} ms")
