package corejava.basics.loops;
import java.util.Scanner;

public class G {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scr.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                isprime = false;
                break;
            }
        }
        if (isprime)
            System.out.println("it is a prime number");
        else
            System.err.println("it is not a prime number");
    }
}
