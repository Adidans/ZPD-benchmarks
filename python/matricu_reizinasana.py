def matrix_multiply(a, b):
    rows = len(a)
    cols = len(b[0])
    result = [[0 for _ in range(cols)] for _ in range(rows)]

    for i in range(rows):
        for j in range(cols):
            for k in range(len(a[0])):
                result[i][j] += a[i][k] * b[k][j]
    return result

def main():
    size = 100

    a = [[1 for _ in range(size)] for _ in range(size)]
    b = [[2 for _ in range(size)] for _ in range(size)]

    _ = matrix_multiply(a, b)

if __name__ == "__main__":
    main()
