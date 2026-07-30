package striver.Basics.Pattern;
import java.util.Stack;
public class QuesSevenTeen {
    public static void main(String[] args) {
        Stack<Character> STACK = new Stack<>();
        for(int i=1;i<=4;i++){
            char alphabet='A';
            for(int j=0;j<4-i;j++) System.out.print("_");
            for(int k=1;k<=i;k++){
                System.out.print(alphabet);
                alphabet+=1;
            }
            alphabet = (char) ('A' + i - 2); // Start from the character right before the peak
            for (int v = 1; v < i; v++) {
                System.out.print(alphabet);
                alphabet--;
            }
            for(int j=0;j<4-i;j++) System.out.print("_");
            System.out.println();
        }
    }
}