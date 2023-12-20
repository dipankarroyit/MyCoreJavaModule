package corejava.basics.method.recursion;
import java.util.Scanner;

public class PrintFibonacciSeriesToNUsingRecursion {
    static int a=0;
    static int b=1;
    static int c;
    static int count;

    static void fib(){
        if (count>=10) return;
        System.out.print(a+" ");
        c=a+b;
        count++;
        a=b;
        b=c;
        fib();
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series upto 10 digit");
        fib();
    }
}
