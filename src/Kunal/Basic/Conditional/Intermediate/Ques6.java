package Kunal.Basic.Conditional.Intermediate;

import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = String.valueOf(scan.nextInt());
        StringBuilder sb = new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            char temp =string.charAt(i);
            sb.append(temp);
        }
        if(Integer.parseInt(sb.toString())==Integer.parseInt(string)){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
