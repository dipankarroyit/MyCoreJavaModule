package corejava.basics.operators;
import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scr.nextInt();

        if (a % 2 == 0){
            System.out.println("It is a Even Number");
        }else {
            System.out.println("It is a Odd Number");
        }
    }
}
