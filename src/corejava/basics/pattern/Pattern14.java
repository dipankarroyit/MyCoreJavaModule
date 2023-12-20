package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
     Scanner scr=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=scr.nextInt();
     int sp=n/2, st=0;
     for (int i=1; i<=n; i++){
         if (i<=n/2){
             sp--;
             st++;
         }
         else {
             sp++;
             st--;
         }
         for (int j=1; j<=sp; j++){
             System.out.print(" ");
         }
         for (int k=1; k<=st; k++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
