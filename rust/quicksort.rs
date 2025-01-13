fn quicksort<T: Ord>(mut arr: Vec<T>) -> Vec<T> {
    if arr.len() <= 1 {
        return arr;
    }

    let pivot = arr.remove(0);
    let mut left = vec![];
    let mut right = vec![];

    for item in arr {
        if item <= pivot {
            left.push(item);
        } else {
            right.push(item);
        }
    }

    let mut sorted_left = quicksort(left);
    let mut sorted_right = quicksort(right);

    sorted_left.push(pivot);
    sorted_left.append(&mut sorted_right);

    sorted_left
}

fn main() {
    let data = vec![10, 5, 2, 3, 7, 9, 1, 8, 4, 6];
    quicksort(data);
}
