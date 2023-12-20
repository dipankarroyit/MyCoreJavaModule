package corejava.string.javaLangString;

public class Test0 {
	public static void main(String[] args) {
		String s1=new String("jAva");
		String s2="java";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
