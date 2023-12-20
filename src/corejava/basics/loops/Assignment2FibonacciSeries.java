package corejava.basics.loops;

import java.util.Scanner;

public class Assignment2FibonacciSeries {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        System.out.println("enter 1st number");
        int first = sce.nextInt();
        System.out.println("enter 2nd number");
        int second = sce.nextInt();
        System.out.println("enter a digit");
        int digit = sce.nextInt();
        int a = first, b = second, c;
        System.out.println("Output :");
        for (int i = 1; i <= digit; i++){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
