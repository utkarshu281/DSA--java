package Algorithm.Sorting.SortingOne.BubbleSort;

import java.net.Socket;

public class MyBubbleSort {
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
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
