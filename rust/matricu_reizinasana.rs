fn matrix_multiply(a: &Vec<Vec<i32>>, b: &Vec<Vec<i32>>) -> Vec<Vec<i32>> {
    let rows = a.len();
    let cols = b[0].len();
    let mut result = vec![vec![0; cols]; rows];

    for i in 0..rows {
        for j in 0..cols {
            for k in 0..a[0].len() {
                result[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    result
}

fn main() {
    let size = 100;
    let a = vec![vec![1; size]; size];
    let b = vec![vec![2; size]; size];
    let _ = matrix_multiply(&a, &b);
    println!("Matrix multiplication completed");
}
