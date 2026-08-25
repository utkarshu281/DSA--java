package Algorithm.Sorting.SortingTwo.recursiveBubbleSort;

public class OptimizedBubbleSorty {
    public static void main(String[] args) {
        int[] arr={10,4,43,5,57,91,45,9,7};
        //int[] arr={10,4,43,9,7};
        int[] sortedArray = recursiveBubbleSort(arr,0,0);
        for(int num:sortedArray){
            System.out.println(num);
        }
    }
    public static int[] recursiveBubbleSort(int[] arr, int i,int j){
        if(arr.length-1==j){
            return arr;
        }
        boolean swap=false;
        for(int k=i;k<arr.length-1-j;k++){
            //-j becuase larger elements are ike rabbit, they move fast to back of the line
            //usually in pass one, so need to compare whole array
            if(arr[k]>arr[k+1]){
                int temp=arr[k+1];
                arr[k+1]=arr[k];
                arr[k]=temp;
                swap=true;
            }
        }
        if(!swap)return arr;
         arr=recursiveBubbleSort(arr,i,j+1);
        return arr;
    }
}
