package Algorithm.Sorting.SortingTwo.recursiveBubbleSort;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr={10,4,43,5,57,91,45,9,7};
        //int[] arr={10,4,43,9,7};
        int[] sortedArray = recursiveBubbleSort(arr,0,0);
        for(int num:sortedArray){
            System.out.println(num);
        }
    }
    public static int[] recursiveBubbleSort(int[] arr, int i,int j){
        int[] finalArray;
        finalArray=arr.clone();
        if(arr.length-1==j){
            return finalArray;
        }

        for(int k=i;k<arr.length-1;k++){
            if(arr[k]>arr[k+1]){
                int temp=arr[k+1];
                arr[k+1]=arr[k];
                arr[k]=temp;

            }
        }
       finalArray= recursiveBubbleSort(arr,i,j+1);
        return finalArray;
    }
}
