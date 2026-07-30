package Kunal.Basic.FirstMd;
//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class QuesTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("check if string is palindrome or not:");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder("");
        for(int i=str.length()-1; i>=0;i--){
            char temp=str.charAt(i);
            sb.append(temp);
        }
        if(str.contentEquals(sb)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }
    }
}
/*
* boolean palindrome = true;

for (int i = 0; i < str.length() / 2; i++) {
    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        palindrome = false;
        break;
    }
}

System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
*
* */
