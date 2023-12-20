package corejava.basics.loops;
import java.util.Scanner;

public class BinaryToDecimalForLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a binary value");
        long bin = scr.nextLong();
        long dec = 0;

        System.out.println("Output:");
        for (long i = 0; bin > 0; i++){
            dec += (bin % 10) * (int)Math.pow(2,i);
            bin = bin / 10;
        }
        System.out.println(dec);
    }
}
