package corejava.basics.operators;
import java.util.Scanner;
class Q {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter String value");
        String a1 = scr.next();
        System.out.println("Enter Int value");
        int a2 = scr.nextInt();
        System.out.println("Enter Double value");
        double a3 = scr.nextDouble();
        System.out.println("Enter Char value");
        char a4 = scr.next().charAt(5);
        System.out.println("Enter Boolean value");
        boolean a5 = scr.nextBoolean();

        System.out.println("a1 ="+a1);
        System.out.println("a2 ="+a2);
        System.out.println("a3 ="+a3);
        System.out.println("a4 ="+a4);
        System.out.println("a5 ="+a5);
    }
}
