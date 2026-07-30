package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }
    }
}
