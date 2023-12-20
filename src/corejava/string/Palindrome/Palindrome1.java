package corejava.string.Palindrome;

public class Palindrome1 {
	public static void main(String[] args) {
		System.out.println("Malayalam");
		System.out.println(isPalindrom("Malayalam"));
		System.out.println(isPalindrom("Java"));
	}
	static boolean isPalindrom(String s) {
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j) {
			if(arr[i]!=arr[j]) return false;
				i++;
				j--;
		}
		return true;
	}
}
