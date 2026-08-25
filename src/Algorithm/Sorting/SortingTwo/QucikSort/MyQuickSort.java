public static void main(String[] args) {

    int[] arr = {50, 25, 92, 16, 76, 30, 43, 54, 19};

    myQuickSort(arr, 0, arr.length - 1);

    for (int num : arr) {
        System.out.println(num);
    }
}

public static void myQuickSort(int[] arr, int low, int high) {

    if (low >= high) {
        return;
    }

    int pivot = low;
    int left = low + 1;
    int right = high;

    while (left <= right) {

        if (arr[left] <= arr[pivot]) {
            left++;
        } else if (arr[right] >= arr[pivot]) {
            right--;
        } else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;

        }
    }

    int partitionPoint = right;

    int temp = arr[pivot];
    arr[pivot] = arr[partitionPoint];
    arr[partitionPoint] = temp;

    myQuickSort(arr, low, partitionPoint - 1);
    myQuickSort(arr, partitionPoint + 1, high);
}