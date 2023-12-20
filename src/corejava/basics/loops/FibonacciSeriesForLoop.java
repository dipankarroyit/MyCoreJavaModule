package corejava.basics.loops;
import java.util.Scanner;
class FibonacciSeriesForLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scr.nextInt();
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
