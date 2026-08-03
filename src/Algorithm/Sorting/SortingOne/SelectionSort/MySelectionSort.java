package Algorithm.Sorting.SortingOne.SelectionSort;
public class MySelectionSort {
    public static void main() {
        int[] arr = {6,7,5,9,4,10,3,2,1};
        int[] sortedArr=selectionSort(arr);
        System.out.print("{");
        for(int i=0;i<sortedArr.length;i++){
            System.out.print(sortedArr[i]+",");
        }
        System.out.println("}");
    }
    public static int[] selectionSort(int[] arr){
        int[] newArray = arr.clone();
        for(int i=0; i<newArray.length;i++){
            int smallest=Integer.MAX_VALUE;
            int temp;
            int index=0;//where from we get the smallest value
            for(int j=i;j<newArray.length;j++){
                if(smallest>newArray[j]){
                    smallest=newArray[j];
                    index=j;
                }
            }
            temp=newArray[i];
            newArray[i]=smallest;
            newArray[index]=temp;
        }
        return newArray;
    }
}
/*
* Idea: Find the smallest element in the unsorted portion and swap it with the first unsorted position.
Pattern: Nested loops (not the two-pointer pattern).
Time Complexity: O(n²) in best, average, and worst cases.
Auxiliary Space: O(1) if sorting in place; O(n) if you clone the array.
Stable? No (by default).
In-place? Yes (if you don't clone).
*
* */