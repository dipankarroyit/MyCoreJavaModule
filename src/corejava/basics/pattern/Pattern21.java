package corejava.basics.pattern;
import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a reange");
		int n=scr.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2!=0) {
					System.out.print("*");
				}
			}
			for(int k=1; k<n-1; k++) {			
				if(k==1)
					System.out.print(" ");
				if(i%2==0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
