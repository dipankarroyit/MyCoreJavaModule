package corejava.basics.loops;
import java.util.Scanner;

public class Assignment1FibonacciSeries {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the starting number");
        int start = scr.nextInt();
        System.out.println("enter the ending number");
        int end = scr.nextInt();
        int a = 0, b = 1, c;
        while (a <= end){
            if (a >= start) {
                System.out.print(a+" ");
            }
                c = a + b;
                a = b;
                b = c;
        }
    }
}
