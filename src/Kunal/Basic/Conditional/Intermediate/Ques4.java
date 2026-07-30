package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalItems=scan.nextInt();
        int chooseItem=scan.nextInt();
        int result = combinational(totalItems,chooseItem);
        int result2 = combinationalOrdered(totalItems,chooseItem);
        System.out.println(result);
        System.out.println(result2);
    }
    public static int combinational(int totalItems, int chooseItems){
        int factorialOfAllItems=factorial(totalItems); //n!
        int factorialOfAllChoosenItems=factorial(chooseItems); //r!
        int itemsLeft = totalItems-chooseItems; //n-r
        int factorialOfRemainingItems=factorial(itemsLeft);//(n-r)!
        return factorialOfAllItems/(factorialOfAllChoosenItems*factorialOfRemainingItems);//n!/n!*(n-r)!
    }
    public static int combinationalOrdered(int totalItems, int chooseItems){
        int factorialOfAllItems=factorial(totalItems); //n!
        int itemsLeft = totalItems-chooseItems; //n-r
        int factorialOfRemainingItems=factorial(itemsLeft);//(n-r)!
        return factorialOfAllItems/factorialOfRemainingItems;//n!/(n-r)!
    }
    public static int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
