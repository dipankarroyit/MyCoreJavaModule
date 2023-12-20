package corejava.basics.loops;
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scr.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i; // (Ex: 10!)
            System.out.println("Factorial of 1 to "+n+" = "+fact);
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}
