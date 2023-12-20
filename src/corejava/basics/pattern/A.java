package corejava.basics.pattern;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int st=1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=st; k++){
               if (k==1||k==st||i==n)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
            st+=2;
        }
    }
}
