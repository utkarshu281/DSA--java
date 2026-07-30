package striver.Basics.BasicsRecursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n=20;
        int start=1;
        print1ToN(start,n);
    }
    public static void print1ToN(int start,int n){
        if(start>n){
            return;
        }
        System.out.println(start);
        print1ToN(start+1,n);
    }
}
