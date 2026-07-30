package striver.Basics.Pattern;
public class QuesEightTeen {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            //char alphabet = (char) ('A' + n - 1 - i);
            char alphabet = (char)('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print(alphabet);
                alphabet++;

            }
            System.out.println();
        }
    }
}