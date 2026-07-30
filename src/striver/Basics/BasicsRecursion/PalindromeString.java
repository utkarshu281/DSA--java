package striver.Basics.BasicsRecursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s="Utkarsh";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String result = reverseString(s,s.length()-1);
        if(result.equals(s)){
            System.out.println("PlaindromeString");
        }else{
            System.out.println("not an palindrome");
        }
        System.out.println();
    }
    public static String reverseString(String s,int max){
        if(max<0){
            return "";
        }
        char temp = s.charAt(max);
        return temp+reverseString(s,max-1);
    }
}
/*
* class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String result = reverseString(s,s.length()-1);
        if(result.equals(s)){
            return true;
        }
        return false;
    }
    public static String reverseString(String s,int max){
        if(max<0){
            return "";
        }
        char temp = s.charAt(max);
        return temp+reverseString(s,max-1);
    }
}
* */