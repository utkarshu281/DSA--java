package striver.Basics.BasicsMaths;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter a second number:");
        int num2 = scanner.nextInt();
        int i=1;
        int hcf=0;
        while(i<=Math.min(num1,num2)){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
            i++;
        }
        System.out.println(hcf);
        scanner.close();
    }
}
