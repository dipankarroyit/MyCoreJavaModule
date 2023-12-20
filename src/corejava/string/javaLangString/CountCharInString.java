package corejava.string.javaLangString;
import java.util.Scanner;

public class CountCharInString {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a word");
		String s1 = scr.nextLine();
		System.out.println("Enter a char");
		char c = scr.next().charAt(0);
		int count = 0;
		for(int i=1; i<s1.length()-1; i++) {
			if(s1.charAt(i)==c)
				count++;
		}
		System.out.println("no of '"+c+"' is : "+count);
	}
}
