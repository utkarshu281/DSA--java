package striver.Basics.BasicsMaths;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        //brute-force
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }else{
            System.out.println("Not a prime");
        }
    }
}
