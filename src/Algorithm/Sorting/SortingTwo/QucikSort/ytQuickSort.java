package Algorithm.Sorting.SortingTwo.QucikSort;

public class ytQuickSort {
    public static void main(String[] args) {
        int[] arr = {50, 25, 92, 16, 76, 30, 43, 54, 19};

        myQuickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.println(num);
        }
    }
    public static void myQuickSort(int[] arr,int low, int high){
        if(low<high){
            int partitionPoint=twoPointerParsing(arr,low,high);
            myQuickSort(arr,low,partitionPoint-1);
            myQuickSort(arr,partitionPoint+1,high);
        }
    }
    public static int twoPointerParsing(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(i <= high && arr[i] <= pivot){ i++; }
            while(j >= low && arr[j] > pivot){ j--; }
            if(i < j){ swap(arr, i, j); }
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
