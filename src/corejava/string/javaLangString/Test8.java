package corejava.string.javaLangString;

public class Test8 {
	public static void main(String[] args) {
		// lower to upper case
		char c1 = 'a';
		char c2 = Character.toUpperCase(c1);
		System.out.println(c2);
		// concatenation  
		String s1 = "ab";
		String s2 = s1+"cd";
		// concatenation using concat()
		String s3=s1.concat("cd");
		System.out.println(s2);
		System.out.println(s3);
	}
}
