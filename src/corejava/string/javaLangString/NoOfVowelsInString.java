package corejava.string.javaLangString;
import java.util.Scanner;

public class NoOfVowelsInString {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter sentence");
		String s=scr.nextLine();
		char[] s1=s.toCharArray();
		char[] arr= {'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(s1[i]==arr[j]) count++;
			}
		}
		System.out.println(count);
	}
}
