package corejava.basics.loops;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = scr.nextInt();
        System.out.println("enter 2nd number");
        int b = scr.nextInt();
        int lcm = a > b ? a : b;
        System.out.println("Output:");
        while (true){
            if (lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }
}
