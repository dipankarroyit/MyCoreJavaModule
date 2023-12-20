package corejava.string.javaLangString;

public class Palindrome2 {
	public static void main(String[] args) {
		String str="Madam";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				String s=str.substring(i, j+1);
				if(isPalindrome(s)) {
					System.out.println(s);
				}
			}
		}
	}
	static boolean isPalindrome(String s) {
		int i=0; int j=s.length()-1;
		char[] a=s.toLowerCase().toCharArray();
		while(i>j) {
			if(a[i] == a[j]) return false; 
		}
		i++;
		j--;
		return true;
	}
}
