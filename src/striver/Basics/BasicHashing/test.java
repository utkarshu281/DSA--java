package striver.Basics.BasicHashing;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        Solution sol = new Solution();
        int value = sol.maxFrequency(arr,5);
        System.out.println(value);
    }
}
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] hashArr = new int[max + 1];
        for(int v=1;v<=k;v++){
            for(int i=0;i<nums.length;i++){
                hashArr[nums[i]]+=1;
            }
        }
        int maxFreq=0;
        int maxFreqElement=0;
        for(int h=0;k<hashArr.length;k++){
            if(hashArr[h]>maxFreq){
                maxFreq=hashArr[h];
                maxFreqElement=h;
            }
        }
        return maxFreq;
    }
}
