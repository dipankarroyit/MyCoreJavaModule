package corejava.basics.loops;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int m=0;
        while(n>0){
            m=(m*10)+(n%10);
            n=n/10;
        }
        System.out.println("Reverse number is : "+m);
    }
}
