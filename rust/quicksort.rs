fn quicksort(arr: &mut [i32]) {
    if arr.len() <= 1 {
        return;
    }
    let pivot_index = arr.len() / 2;
    let (mut left, mut right): (Vec<i32>, Vec<i32>) = arr
        .iter()
        .enumerate()
        .partition(|&(i, &x)| x < arr[pivot_index] && i != pivot_index);

    left.push(arr[pivot_index]);
    left.append(&mut right);
    arr.copy_from_slice(&left);
}

fn main() {
    let mut data = vec![10, 5, 2, 3, 7, 9, 1, 8, 4, 6];
    quicksort(&mut data);
    println!("Sorted array: {:?}", data);
}
