package corejava.basics.loops;
import java.util.Scanner;

public class ReturnKeyword {
    public static void main(String[] args){
        System.out.println("main method starts");
        m1();
        System.out.println("main method ends");
    }
    public static void m1(){
        System.out.println("m1 method starts");
        for (int i = 0; i <= 5; i++){
            if (i == 3)
                continue;
            System.out.println("a = "+i);
        }
        System.out.println("m1 method ends");
    }
}
