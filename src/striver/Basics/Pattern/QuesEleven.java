package striver.Basics.Pattern;
public class QuesEleven {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int start= (i%2==0)?0:1;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}