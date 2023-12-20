package corejava.string.javaUtilStack;
import java.util.Scanner;

public class ProperString {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.print("enter a sentence in lower case = ");
		String str=scr.nextLine();
		String [] arr=str.split(" ");
		String s2=properCase(arr[0]);
		for(int i=1; i<arr.length; i++) {
			s2+=" "+properCase(arr[i]); 
		}
		System.out.println("Proper String = "+s2);
	}
	static String properCase(String s) {
		String s1=s.substring(0,1).toUpperCase();
		String s2=" ";
		if(s.length()>1) {
			s2=s.substring(1).toLowerCase();
		}
		return s1+s2;
	}
}
