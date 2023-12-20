package corejava.basics.operators;
import java.util.Scanner;

class Bigger {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int a = scr.nextInt();
        System.out.println("Enter a 2nd number");
        int b = scr.nextInt();

        if (a>b){
            System.out.println("1st number is bigger");
        }else if (a<b){
            System.out.println("2nd number is bigger");
        }else {
            System.out.println("both are same");
        }

    }
}
