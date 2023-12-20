package corejava.basics.loops;
import java.util.Scanner;

class SumOfOneToN {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scr.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of 1 to "+n+" = "+sum);
    }
}
