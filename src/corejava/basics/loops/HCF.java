package corejava.basics.loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = scr.nextInt();
        System.out.println("enter 2nd number");
        int b = scr.nextInt();
        int hcf = a < b ? a : b;
        System.out.println("Output:");
        while (true){
            if (a % hcf == 0 && b % hcf == 0){
                break;
            }
            hcf--;
        }
        System.out.println(hcf);
    }
}
