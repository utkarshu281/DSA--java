package Kunal.Basic.Conditional.Intermediate;
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            char temp =string.charAt(i);
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }
}
