package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a size (odd number)");
        int n=scr.nextInt();
        int st=0;

        for (int i=1; i<=n; i++){
            if (i<=n/2+1)
                st++;
            else
                st--;
            for (int j=1; j<=st; j++){
                if (j==1||j==st)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
