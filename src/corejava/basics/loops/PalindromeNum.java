package corejava.basics.loops;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int m=0;
        int sum=n;

        while(n>0){
            m=(m*10)+(n%10);
            n=n/10;
        }
        if (sum==m)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}
