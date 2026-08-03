package striver.Basics.BasicHashing;
//hashing:- prestore something and fetch it whenm it is required
public class Hashing {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,1,2,3,6,1,3,4,10};
        int[] arrTwo = {1,2,1,3,2};
        int[] hashArr=new int[13];
        int[] hashArrTwo = new int[11];
        for(int i=0;i<arr.length;i++){
//            if(i==arr[i]){
//                HashArr[i]+=1;
//            }
//            if(HashArr[i]==arr[i]){
//                HashArr[i]+=1;
//            }
            hashArr[arr[i]]+=1;//had to look this condition
        }
        for(int i=0;i<arrTwo.length;i++){
            hashArrTwo[arrTwo[i]]+=1;
        }
        for(int i=0;i<hashArr.length;i++){
            System.out.println("Number of appearance of hash array "+i+": "+ hashArr[i]);
        }
        for(int i=0;i<hashArrTwo.length;i++){
            System.out.println("Number of appearance of second hash array "+i+": "+ hashArrTwo[i]);
        }
    }
}
