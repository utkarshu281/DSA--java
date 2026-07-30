package striver.Basics.BasicsMaths;
//count digits of all number
import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();
        //brute force approach
        int original_num=num;
        int count=0;
        while(original_num>0){
            int temp=original_num/10;
            count++;
            original_num=temp;
        }
        System.out.println("totla number of digits in a number"+count);
        scan.close();
    }
}
