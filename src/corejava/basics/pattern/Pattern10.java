package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a size");
        int n=scr.nextInt();
        int st=1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=st; k++){
                System.out.print("*");
            }
            System.out.println();
            st+=2;
        }
    }
}
