package corejava.basics.operators;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a year");
        int y = scr.nextInt();

        if (y % 400 == 0 || ( y % 4 == 0 && y % 100 != 0 )){
            System.out.println("its a leap year");
        }else {
            System.out.println("it's not a leap year");
        }
    }
}
