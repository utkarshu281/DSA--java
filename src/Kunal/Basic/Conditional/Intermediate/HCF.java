package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        int hcf=0;
        int product = num1*num2;
        int i=1;
        while(i<=Math.min(num1,num2)){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
            i++;
        }
        int lcm = product/hcf;
        System.out.println("LCM: "+lcm+" and HCF: "+ hcf);

    }
}
