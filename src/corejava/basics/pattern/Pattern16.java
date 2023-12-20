package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int n=scr.nextInt();
        int sp=n/2, st=0; //we can change the sp value to change the position.
        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for (int k=0; k<=st; k++){
                System.out.print("*");
            }
            System.out.println();
            if (i<=n/2){
                sp--;
                st+=2;
            }else {
                sp++;
                st-=2;
            }
        }
    }
}
