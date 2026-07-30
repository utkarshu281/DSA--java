package striver.Basics.BasicsMaths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DivisorOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfDivisors = new ArrayList<>();
        System.out.print("Enter a number:");
        var num = scanner.nextInt();
        System.out.println("the divisors are:-");
        for(var i=1;i*i<=num;i++){
            if(num%i==0){
                listOfDivisors.add(i);
                if(i!=num/i) listOfDivisors.add(num/i);//for left out number whose i*i greater than num
            }

        }
        Collections.sort(listOfDivisors);
        listOfDivisors.forEach(System.out::println);
        scanner.close();
    }

}
