package striver.Basics.BasicsMaths;

import java.util.Scanner;

public class Armstrong{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter a number, to check it is armstrong or not:");
            int num = scan.nextInt();
            int original = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == original) {
                System.out.println("Armstrong");
            } else {
                System.out.println("Not Armstrong");
            }
            scan.close();
        }


}
