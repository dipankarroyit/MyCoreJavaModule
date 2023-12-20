package corejava.basics.loops;
import java.util.Scanner;

public class DecimalToBinaryWhileLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int dec = scr.nextInt(); // for more then 3 digit input we need to use long data type for all
        int bin = 0;
        int i = 1;

        while(dec > 0){
            int r = dec % 2;
            bin = bin + r * i;
            dec = dec / 2;
            i = i * 10;
        }
        System.out.println(bin);
    }
}

