package striver.Basics.BasicsRecursion;

public class PrintNTimes {
    public static void main(String[] args) {
        int n=20;
        printN(20);
    }
    public static void printN(int n){
        if(n<=0){
            return ;
        }
        System.out.println(n);
        printN(n-1);
    }
}
