package Algorithm.Sorting.SortingOne.SelectionSort;

public class SelectionSortOptimized {
    public static void main() {
            int[] arr = {6,7,5,9,4,10,3,2,1};
            int[] sortedArr=selectionSort(arr);
            System.out.print("{");
        for (int j : sortedArr) {
            System.out.print(j + ",");
        }
            System.out.println("}");
        }
        public static int[] selectionSort(int[] arr){
            int min,temp;
            //length-1 becuase the time we will reach last element, the array will already be sorted
            for(int i=0; i<arr.length-1;i++){
                min=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min=j;
                    }
                }
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
            return arr;
        }

}
