package Algorithm.Sorting.SortingTwo.MergeSort;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr={9,3,7,5,6,4,8,2};
        int[] sortedArray = mergeSort(arr,0,arr.length-1);
        for(int num:sortedArray){
            System.out.println(num);
        }
    }
    public static int[] mergeSort(int[] arr,int low,int high){
        int[] finalArray = new int[100];
       finalArray= divide(arr,low,high);
        return finalArray;
    }
    public static int[] divide(int[] arr,int low,int high){
        int[] newArray = null;
        if (low == high) {
            return new int[]{arr[low]};
        }
            int mid=low+(high-low)/2;
            var left=divide(arr,low,mid);
            var right=divide(arr,mid+1,high);
           newArray= merge(left,right);

        return newArray;
    }
    public static int[] merge(int[] left, int[] right){
        int[] finalResult = new int[left.length+right.length];
        int i=0,j=0,c=0;
        while(i<left.length && j<right.length){
            if (left[i]<right[j]){
                finalResult[c++]=left[i++];
            }else{
                finalResult[c++]=right[j++];
            }
        }
        while(i<left.length){
            finalResult[c++]=left[i++];
        }
        while(j<right.length){
            finalResult[c++]=right[j++];

        }
        return finalResult;
    }
}
