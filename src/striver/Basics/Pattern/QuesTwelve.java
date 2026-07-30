package striver.Basics.Pattern;
public class QuesTwelve {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for (int j=1;j<=i;j++)System.out.print(j+""); //left-numbers
            for(int k=1;k<=4-i;k++) System.out.print(" ");//left space
            for(int v=1;v<=4-i;v++) System.out.print(" ");//left space
            for (int j=i;j>=1;j--)System.out.print(""+j); //right-numbers
            System.out.println();
        }
    }
}