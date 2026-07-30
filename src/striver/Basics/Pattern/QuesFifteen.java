package striver.Basics.Pattern;
public class QuesFifteen {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            char alpha ='A';
            for(int j=5;j>i;j--){
                System.out.print(alpha);
                alpha+=1;
            }
            System.out.println();
        }
    }
}