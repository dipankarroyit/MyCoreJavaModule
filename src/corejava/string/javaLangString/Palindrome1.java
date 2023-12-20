package corejava.string.javaLangString;

public class Palindrome1 {
	public static void main(String[] args) {
		System.out.println("isPalindrome = "+isPalindrome1("Malayalam"));
		System.out.println("isPalindrome = "+isPalindrome1("Java"));
	}
	static boolean isPalindrome1(String s) {
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j) {
			if(arr[i] != arr[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
