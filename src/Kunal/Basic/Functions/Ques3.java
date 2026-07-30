package Kunal.Basic.Functions;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        primeNumbers(num1,num2);
    }
    public static void primeNumbers(int num1, int num2){
        for(int i=num1;i<num2;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                    //do nothing
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
