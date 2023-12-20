package corejava.string.javaLangString;

public class Test2 {
	public static void main(String[] args) {
		String s1="javadeveloper";
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 8));
		
		for (int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
		}
		
		System.out.println();
		
		for (int i=s1.length()-1; i>=0; i--) {
			char c=s1.charAt(i);
			System.out.print(c + " ");
		}
	}
}
