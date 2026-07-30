package striver.Basics.BasicsRecursion;
class Solution {
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
/*
* class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        boolean answer=reverseString(s,right,left);
    }
    public static boolean reverseString(String s,int right,int left){
        if(left>=right){
            return true;
        }
        char start = s.charAt(left);
        char end = s.charAt(right);

        if (!Character.isLetterOrDigit(start)) {
            return check(s, left + 1, right);
        }
        if (!Character.isLetterOrDigit(end)) {
            return check(s, left, right - 1);
        }
        if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
            return false;
        }

        // Both match, move both pointers inward
        return check(s, left + 1, right - 1);
    }
}
* */