package corejava.basics.loops;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        int m=n;
        int len=0;
        while (m>0){
            len++;
            m=m/10;
        }
        int sum=0;
        m=n;
        while(m>0){
            int d=m%10;
            sum+=(int)Math.pow(d,len);
            m=m/10;
        }
        if (n==sum)
            System.out.println("it is a armstrong number");
        else
            System.out.println("it is not an armstrong number");
    }
}
