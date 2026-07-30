package Kunal.Basic.FirstMd;
import java.util.Scanner;
public class QuesFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("enter the first number:");
        int num2 = scan.nextInt();
        for(int i=num1+1;i<num2;i++){
            int num = i;
            int original = num;
            int sum = 0;
            int digits = String.valueOf(original).length();
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            if (sum == original) {
                System.out.println(original);
            }
        }

    }
}
