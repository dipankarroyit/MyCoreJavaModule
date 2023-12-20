package corejava.basics.operators;
import java.util.Scanner;

class Range {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scr.nextInt();

        if (a > 0){
            if (a <= 50){
                System.out.println("it is in range between 1 to 50");
            }else {
                System.out.println("it not in range between 1 to 50");
            }
        }else {
            System.out.println("incorrect input");
        }

    }
}
