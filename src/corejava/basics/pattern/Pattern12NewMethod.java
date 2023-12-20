package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern12NewMethod {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int st=0;
        int sp=0;

        for (int i=1; i<=n; i++){
            if (i<=n/2)
                st++;
            else st--;
            for (int j=1; j<=sp; i++){
                System.out.print(" ");
            }
            for (int k=1; k<=st; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
