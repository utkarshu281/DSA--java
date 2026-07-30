package striver.Basics.Pattern;
public class QuesThirteen {
    public static void main(String[] args) {
        int variable =0;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                variable+=1;
                System.out.print(variable+" ");
            }
            System.out.println();
        }
    }    
}