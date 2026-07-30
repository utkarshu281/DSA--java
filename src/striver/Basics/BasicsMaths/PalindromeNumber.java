package striver.Basics.BasicsMaths;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = scanner.nextInt();
        int original_num=num;
        StringBuilder reverse_number= new StringBuilder();
        while(num>0){
            int temp = num%10;
            reverse_number.append(temp);
            num=num/10;
        }
        if(original_num==Integer.parseInt(reverse_number.toString())){
            System.out.println("Palindome number");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
