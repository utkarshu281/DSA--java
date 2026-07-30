package striver.Basics.BasicHashing;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,1,2,3,6,1,3,4,10};
        int[] HashArr=new int[13];
        for(int i=0;i<arr.length;i++){
//            if(i==arr[i]){
//                HashArr[i]+=1;
//            }
//            if(HashArr[i]==arr[i]){
//                HashArr[i]+=1;
//            }
            HashArr[arr[i]]+=1;//had to look this condition
        }
        for(int i=0;i<HashArr.length;i++){
            System.out.println("Number of appearance of "+i+": "+HashArr[i]);
        }
    }
}
