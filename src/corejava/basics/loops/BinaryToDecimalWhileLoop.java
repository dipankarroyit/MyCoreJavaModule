package corejava.basics.loops;
import java.util.Scanner;

public class BinaryToDecimalWhileLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a binary number");
        int bin = scr.nextInt();
        int dec = 0;
        int i = 0;

        System.out.println("Output:");
        while(bin > 0){
            dec += (bin % 10) * (int)Math.pow(2,i);
            bin = bin / 10;
            i++;
        }
        System.out.println(dec);
    }
}
