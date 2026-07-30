package striver.Basics.BasicsRecursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = arr.length-1;
        int i=0;
        reverseAnArray(arr,max,i);
        for (int k : arr) {
            System.out.println(k);
        }
    }
    public static void reverseAnArray(int[] arr,int max, int i){
        if(i>max){
            return;
        }
        int temp=arr[max];
        int temp2 = arr[i];
        arr[i]=temp;
        arr[max]=temp2;
        reverseAnArray(arr,max-1,i+1);
    }
}
