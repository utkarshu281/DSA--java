package Algorithm.Sorting.SortingTwo.MergeSort;
public class MyMergeSort {
    public static void main() {
        int[] arr={10,4,43,5,57,91,45,9,7};
        int[] sortedArray=myMergeSort(arr,0,arr.length-1);
        for(int num:sortedArray){
            System.out.println(num);
        }

    }
    public static int[] myMergeSort(int[] arr, int start, int end){
        int[] finalArray = new int[arr.length+1];//+1 is extra
        finalArray=divide(arr,start,end);
        return finalArray;
    }
    public static int[] divide(int[] arr, int start, int end){
        int[] newArray;
        if(start==end){
            return new int[]{arr[start]};
        }
        int mid=(start+(end-start)/2);
        var leftPart=divide(arr,start,mid);
        var rightPart=divide(arr,mid+1,end);
        newArray= merge(arr,leftPart,rightPart);
        return newArray;
    }
    public static int[] merge(int[] arr,int[] leftPart,int[] rightPart){
        int[] result = new int[leftPart.length+rightPart.length];
        int k=0,i=0,j=0;
        while(i<leftPart.length && j<rightPart.length){
            if(leftPart[i]<=rightPart[j]){
                result[k++]=leftPart[i++];
            }else{
                result[k++]=rightPart[j++];
            }

        }
        while(i<leftPart.length){
            result[k++]=leftPart[i++];

        }while(j<rightPart.length){
            result[k++]=rightPart[j++];

        }
        return result;
    }
}