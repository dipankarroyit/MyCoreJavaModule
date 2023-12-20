package corejava.basics.loops;
import java.util.Scanner;
public class DecimalToBinaryForLoop {
    public static void main(String... arg){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        long dec = scr.nextLong();
        long bin = 0;

        for (long i = 1; dec > 0; i = i * 10){
            long r = dec % 2;
            bin = bin + r * i;
            dec = dec / 2;
        }
        System.out.println(bin);
    }
}
