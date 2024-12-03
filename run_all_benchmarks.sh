#!/bin/bash

# Define paths to each benchmark file (update with correct paths)
CPP_FILE="cpp_benchmark.cpp"
PYTHON_FILE="python_benchmark.py"
JAVA_FILE="JavaBenchmark.java"
# FLUX_FILE="flux_benchmark.flux"

# Function to run the C++ benchmark
run_cpp_benchmark() {
    echo "Running C++ Benchmark..."
    g++ -std=c++11 -o cpp_benchmark $CPP_FILE && ./cpp_benchmark
    # Clean up compiled files
    echo "Cleaning up C++ files..."
    rm cpp_benchmark
}

# Function to run the Python benchmark
run_python_benchmark() {
    echo "Running Python Benchmark..."
    python3 $PYTHON_FILE
    # No need to clean up Python files
}

# Function to run the Java benchmark
run_java_benchmark() {
    echo "Running Java Benchmark..."
    javac $JAVA_FILE
    java JavaBenchmark
    # Clean up compiled Java files
    echo "Cleaning up Java files..."
    rm JavaBenchmark.class
}

# Function to run the Flux benchmark
# run_flux_benchmark() {
#     echo "Running Flux Benchmark..."
#     flux $FLUX_FILE
#     # No cleanup needed for Flux as it doesn't produce compiled files
# }

# Run all benchmarks
run_cpp_benchmark
run_python_benchmark
run_java_benchmark
# run_flux_benchmark

echo "All benchmarks have been executed and cleaned up."
