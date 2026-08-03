package striver.Basics.BasicHashing;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] hashArr = new int[max + 1];

        for (int num : arr) {
            hashArr[num]++;
        }
        for(int i=0;i<arr.length;i++){
            hashArr[arr[i]]+=1;
        }
        for(int j=0;j<hashArr.length;j++){
            System.out.println(j+" occurs this "+hashArr[j]+" times");
        }
    }
}
