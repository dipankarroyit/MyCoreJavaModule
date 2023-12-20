package corejava.basics.loops;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number");
        int n =scr.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("it is a prime number");
        else
            System.out.println("it not a prime number");
    }
}
