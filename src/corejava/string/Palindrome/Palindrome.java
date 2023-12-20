package corejava.string.Palindrome;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Malayalam");
		System.out.println("isPalindrome : "+isPalindrome("Malayalam"));
		System.out.println("isPalindrome : "+isPalindrome("Java"));
	}
	static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int i=0, j=s.length()-1;
		while (i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
