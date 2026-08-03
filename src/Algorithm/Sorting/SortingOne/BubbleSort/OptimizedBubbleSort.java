package Algorithm.Sorting.SortingOne.BubbleSort;

public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] arr={10,4,43,5,57,91,45,9,7};
        int[] sortedArray=bubbleSort(arr);
        System.out.print("{");
        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+",");
        }
        System.out.println("}");

    }
    public static int[] bubbleSort(int[] arr){
        int temp;
        //swapped variable to not wast any more iteration on already sorted array-why?
        //becuz if now swaps happens that mean array is alreay sorted
        boolean swapped=true;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){////in the first phase only the final value is sorted
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)break;
        }
        return arr;
    }
}
