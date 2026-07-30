package striver.Basics.Pattern;
public class QuesSixteen {
    public static void main(String[] args) {
        char alpha ='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(alpha);
            }
            alpha+=1;
            System.out.println();
        }
    }
}