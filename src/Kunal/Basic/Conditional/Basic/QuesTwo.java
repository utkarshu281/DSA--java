package Kunal.Basic.Conditional.Basic;
//Input a number and print all the factors of that number
import java.util.Scanner;
public class QuesTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scan.nextInt();
        System.out.printf("factors of %d are %n",num);
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
