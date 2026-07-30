package Kunal.Basic.Conditional.Intermediate;
//avg of N numbers
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers you want to take:");
        int num = scan.nextInt();
        int original= num;
        float sum=0;
        while(num>0){
            int numbers = scan.nextInt();
            sum=sum+numbers;
            num=num-1;
        }
        System.out.printf("The Average of %d numbers is %f%n",original,(sum/original));
    }
}
