package corejava.basics.loops;
import java.util.Scanner;
public class AddingDigitInNumber {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
