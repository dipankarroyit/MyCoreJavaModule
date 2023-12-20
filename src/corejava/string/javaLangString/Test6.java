package corejava.string.javaLangString;

public class Test6 {
	public static void main(String[] args) {
		String s1="i am a javadeveloper";
		System.out.println(s1.contains("java"));
		System.out.println(s1.startsWith("i am"));
		System.out.println(s1.endsWith("developer"));	
		String s2="java dev";
		System.out.println(s2.trim());
	}
}
