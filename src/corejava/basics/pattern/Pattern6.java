package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a size");
        int n=scr.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i+j==n+1||j==n||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
