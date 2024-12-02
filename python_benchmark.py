import time

# Fibonacci - Recursive
def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

# Sorting - Bubble Sort
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Prime Checking
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

# Test Functions
def run_benchmarks():
    # Fibonacci
    start = time.time()
    fib(30)
    print("Fibonacci Time: ", time.time() - start)

    # Sorting
    arr = [64, 34, 25, 12, 22, 11, 90]
    start = time.time()
    bubble_sort(arr)
    print("Bubble Sort Time: ", time.time() - start)

    # Prime Checking
    start = time.time()
    is_prime(104729)
    print("Prime Checking Time: ", time.time() - start)

if __name__ == "__main__":
    run_benchmarks()
