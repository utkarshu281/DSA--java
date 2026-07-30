package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("enter the second number:");
        int num2 = scan.nextInt();
        for(int i = Math.max(num1,num2);i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                System.out.println(i);
                break;//for least common multiple
            }
        }
    }
}
