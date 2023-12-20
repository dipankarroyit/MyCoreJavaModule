package corejava.string.javaLangString;
import java.util.Scanner;

public class NoOfNumbersInString {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scr.nextLine();
		char[] s1=s.toCharArray();
		char[] arr={'0','1','2','3','4','5','6','7','8','9'};
		int count=0;
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(s1[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
