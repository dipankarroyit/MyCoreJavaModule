package corejava.string.javaLangString;
import java.util.Scanner;

public class ReverseStringSentence {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter sentence");
		String s=scr.nextLine();
		String [] arr=s.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}	
	}
}
