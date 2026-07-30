package striver.Basics.BasicsRecursion;

public class SumOfN {
    public static void main(String[] args) {
        int n=20;
        int result=sumOfN(n);
        System.out.println(result);
    }
    public static int sumOfN(int n){
        if(n<=0){
            return 0;
        }
        return n+sumOfN(n-1);
    }
}
