package Algorithm.Sorting.SortingOne.InsertionSort;

public class OptimizedInsertionSort {
    public static void main(String[] args) {
        int[] arr ={4,5,10,43,57,91,45,9,7};
        int[] sortedArr=insertionSort(arr);
        for(int num : sortedArr){
            System.out.println(num);
        }
    }
    public static int[] insertionSort(int[] arr ){
        int i,j,v;
        for(i=1;i<=arr.length-1;i++){
            v=arr[i];
            j=i;
            while(arr[j-1]>v && j>=1){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;
        }
        return arr;
    }
}
