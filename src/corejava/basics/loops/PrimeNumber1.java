package corejava.basics.loops;
import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scr.nextInt();

        for (int i = 2; i <= n/2; i++){
            if (n % 1 == 0){
                System.out.println("not a prime number");
                return;
            }
        }
        System.out.println("it's a prime number");
    }
}

