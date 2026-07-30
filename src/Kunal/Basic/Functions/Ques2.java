package Kunal.Basic.Functions;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        boolean result = primeOrNot(num);
        System.out.println(result);
    }
    public static boolean primeOrNot(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i*i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
// for (int i = 2; i * i <= num; i++) for optimized condition