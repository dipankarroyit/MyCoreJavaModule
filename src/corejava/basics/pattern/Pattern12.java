package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a Size (odd number)");
        int n=scr.nextInt();
        int st=0;
        for (int i=1;i<=n;i++){
            if (i<=n/2+1)
                st++;
            else
                st--;
            for (int j=1; j<=st; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
