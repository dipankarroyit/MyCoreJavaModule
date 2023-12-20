package corejava.basics.pattern;
import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scr.nextInt();
        int a=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}
