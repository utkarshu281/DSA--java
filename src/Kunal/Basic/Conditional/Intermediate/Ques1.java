package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number to find factorial:");
        int num= scan.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }
    public static int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
