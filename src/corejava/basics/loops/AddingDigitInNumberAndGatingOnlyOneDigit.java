package corejava.basics.loops;
import java.util.Scanner;
public class AddingDigitInNumberAndGatingOnlyOneDigit {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scr.nextInt();
        int sum=0;
        do {
            sum=0;
            while (n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
            System.out.println(sum);
        }while (sum>9);
    }
}
