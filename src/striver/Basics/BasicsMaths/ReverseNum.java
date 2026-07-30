package striver.Basics.BasicsMaths;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = scanner.nextInt();
        //brute force approach
        int original_num=num;
        String reverse_number="";
        while(original_num>0){
            int last_digit = original_num%10;
            reverse_number=reverse_number+String.valueOf(last_digit);
            original_num=original_num/10;
        }
        System.out.println(Integer.parseInt(reverse_number));
        scanner.close();
    }
}