package striver.Basics.BasicsRecursion;

public class Factorial {
    public static void main(String[] args) {
        int num=20;
        long result=factorial(num);
        System.out.println(result);
    }
    public static long factorial(int n){
        if(n<=0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
