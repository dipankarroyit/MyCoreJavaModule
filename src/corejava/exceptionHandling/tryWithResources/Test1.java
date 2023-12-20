package corejava.exceptionHandling.tryWithResources;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int c=0, a, b;
		try (Scanner scr=new Scanner(System.in)){
			System.out.println("Enter a number");
			a=scr.nextInt();
			b=scr.nextInt();
			c=a/b;
			System.out.println(c);
		}catch (ArithmeticException | InputMismatchException i){
			System.out.println("Exception Handaled");
		}
	}
}
