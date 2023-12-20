package corejava.basics.operators;
import java.util.Scanner;
class R {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a New Line String value");
        String a1 = scr.nextLine();
        System.out.println("Enter a String value");
        String a2 = scr.next();

        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
    }
}
