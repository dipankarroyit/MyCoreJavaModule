package corejava.string.javaLangString;
import java.util.Scanner;

public class ReverseStringSentenceEachChar {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s1=scr.nextLine();
		String[] arr=s1.split(" ");
		String s2=reverse(arr[0]);
		for(int i=1; i<arr.length; i++) {
			s2 += " "+reverse(arr[i]);
		}
		System.out.println(s2);	
	}
	static String reverse(String s) {
		String s2="";
		for(int i=s.length()-1; i>=0; i--) {
			s2+=s.charAt(i);
		}
		return s2;
	}
}	
