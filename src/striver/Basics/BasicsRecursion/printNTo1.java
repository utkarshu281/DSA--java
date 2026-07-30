package striver.Basics.BasicsRecursion;

public class printNTo1 {
    public static void main(String[] args) {
        int n=20;
        printNToOne(20);
    }
    public static void printNToOne(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }
}
