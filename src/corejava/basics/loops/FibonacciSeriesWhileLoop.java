package corejava.basics.loops;
import java.util.Scanner;

public class FibonacciSeriesWhileLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scr.nextInt();
        int a = 0, b = 1, c;
        for ( ;a <= n; ){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
