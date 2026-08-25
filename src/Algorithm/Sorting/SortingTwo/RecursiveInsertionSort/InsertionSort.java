package Algorithm.Sorting.SortingTwo.RecursiveInsertionSort;

public class InsertionSort {
    public static void main(String[] ignoredArgs) {
        //int[] arr={10,4,43,5,57,91,45,9,7};
        int[] arr={10,4,43,5,57};
        int[] sortedArray=myInsertionSort(arr,1);
        for(int num:sortedArray){
            System.out.println(num);
        }
    }
    public static int[] myInsertionSort(int[] arr, int i){
        int changeIndex;
        int saveIndex=0;
        if(arr.length==i){
            return arr;
        }
        int element=arr[i];
        boolean fail=false;
        for(int k=i-1;k>=0;k--){
            if(arr[k]>element){
                changeIndex=k;
                saveIndex=k;
                arr[k+1]=arr[changeIndex];
            }else{
                arr[k+1]=element;
                fail=true;
                break;
            }
        }
        if(!fail){
            arr[saveIndex]=element;
        }
        arr=myInsertionSort(arr,++i);
        return arr;

    }
}
