package Kunal.Basic.Conditional.Intermediate;
//power in java
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int power = scan.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=base*result;
        }
        System.out.println(result);
    }
}
