package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern21EasyMethod {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a range");
		int n=scr.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i+j)%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
