package java;
public class MatricuReizinasana {
    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int size = 100;
        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = 1;
                b[i][j] = 2;
            }
        }
        @SuppressWarnings("unused")
        int[][] result = matrixMultiply(a, b);
        System.out.println("Matrix multiplication completed");
    }
}
