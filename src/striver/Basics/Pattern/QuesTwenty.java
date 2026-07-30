package striver.Basics.Pattern;
public class QuesTwenty {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int star=0;star<i+1;star++) System.out.print("*");
            for(int space=0;space<8-2*i;space++)System.out.print(" ");
            for(int star=0;star<i+1;star++) System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int star=0;star<4-i;star++)System.out.print("*");
            for(int space=0;space<2+2*i;space++) System.out.print(" ");
            for(int star=0;star<4-i;star++)System.out.print("*");
            System.out.println();
        }
    }
}