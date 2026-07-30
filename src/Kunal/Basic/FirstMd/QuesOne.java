package Kunal.Basic.FirstMd;
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class QuesOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number for fibonacci series:");
        int max = scan.nextInt();
        int starting=0;
        int first=1;
        if (max >= 1) System.out.println(starting);
        if (max >= 2) System.out.println(first);
        for(int i=3;i<=max;i++){
            int sum=starting+first;
            starting = first;
            first=sum;
            System.out.println(first);
        }

    }
}
