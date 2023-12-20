package corejava.basics.pattern;
import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a range");
        int n=scr.nextInt();
        int num=0;
        for (int i=1; i<=n; i++){
            if (i%2!=0){
                num=(i-1)*n+1;
            }
            else {
                num=i*n;
            }
            for (int j=1; j<=n; j++){
                System.out.print(num+" ");
                if (i%2!=0)
                    num++;
                else
                    num--;
            }
            System.out.println();
        }
    }
}
