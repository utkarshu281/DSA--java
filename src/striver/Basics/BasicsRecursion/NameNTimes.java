package striver.Basics.BasicsRecursion;

public class NameNTimes{
    public static void main(String[] args) {
        String name="Utkarsh";
        int n=30;
        nameN(name,n);
    }
    public static void nameN(String name,int n){
        if(n<=0){
            return ;
        }
        System.out.println(name);
        nameN(name,n-1);
    }
}
