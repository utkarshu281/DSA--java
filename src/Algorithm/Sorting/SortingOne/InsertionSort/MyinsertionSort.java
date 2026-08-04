package Algorithm.Sorting.SortingOne.InsertionSort;
/*
* implementation is not shift-based because it repeatedly swaps adjacent elements.
* It achieves the same result, but in a different way.
* */
public class MyinsertionSort {
    public static void main() {
        int[] arr={4,3,1,2};
        int[] sortedArray=insertionSort(arr);
        System.out.print("{");
        for (int j : sortedArray) {
            System.out.print(j + ",");
        }
        System.out.println("}");
        int[] shiftBasedSortedArray=shiftBasedInsertionSort(arr);
        System.out.print("{");
        for (int j : shiftBasedSortedArray) {
            System.out.print(j + ",");
        }
        System.out.println("}");
    }

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int sortedIndex=i-1;
            int currentIndex=i;
            while(sortedIndex>=0){
                if(arr[sortedIndex]>arr[currentIndex]){
                    int temp=arr[currentIndex];
                    arr[currentIndex]=arr[sortedIndex];
                    arr[sortedIndex]=temp;
                    currentIndex=currentIndex-1;
                }else{break;}
                sortedIndex--;
            }

        }
        return arr;
    }
    public static int[] shiftBasedInsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int sortedIndex=i-1;
            int currentIndex=i;
            int element=arr[currentIndex];
            while(sortedIndex>=0){
                if(arr[sortedIndex]>element){
                    arr[currentIndex]=arr[sortedIndex];
                    currentIndex=sortedIndex;
                }else{
                    arr[currentIndex]=element;
                    break;
                }
                sortedIndex--;
            }
            arr[currentIndex] = element;//for sortedIndex == -1; case
        }
        return arr;
    }
}
