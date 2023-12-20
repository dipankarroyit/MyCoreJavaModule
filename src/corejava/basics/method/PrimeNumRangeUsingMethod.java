package corejava.basics.method;
import java.util.Scanner;
//todo
public class PrimeNumRangeUsingMethod {
    static boolean checkPrime(int n){
        if (n<2) return false;
        for (int i=2; i<=n/2; i++){
            if(n%1==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a range");
        int a=scr.nextInt();
        int b=scr.nextInt();
        for (int i=a; i<=b; i++){
            if(checkPrime(i)) System.out.print(i+" ");
        }
    }
}
