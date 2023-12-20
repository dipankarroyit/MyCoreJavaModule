package corejava.string.javaLangString;
import java.util.Scanner;

public class ReverseStringSentenceEachChar1 {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a Scantence");
		String s1=scr.nextLine();
		char[] arr=s1.toCharArray();
		String s2="";
		int i=0, j=0;
		while(j<arr.length) {
			while(j<arr.length && arr[j]!=' ')
				j++;
			int k=j-1;
			String temp="";
			while(k>=i){
				temp+=arr[k--];
			}
			s2+=temp;
			if(j<arr.length) s2+=" ";
			i=++j;
		}
		System.out.println(s2);
	}
}
