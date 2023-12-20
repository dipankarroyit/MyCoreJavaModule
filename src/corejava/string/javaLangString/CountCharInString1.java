package corejava.string.javaLangString;
import java.util.Scanner;

public class CountCharInString1 {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scr.nextLine();
		System.out.println("enter a char");
		char c=scr.next().charAt(0);
		
		int count = s1.length()-s1.replace(c+"", "").length();
		System.out.println("no of '"+c+"' is : "+count);
	}
}
