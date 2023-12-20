package corejava.string.javaLangString;

public class Test3 {
	public static void main(String[] args) {
		String s1="javadeveloper";
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf("dev"));
		System.out.println(s1.indexOf('e', 8));
		System.out.println(s1.indexOf("op", 8));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.lastIndexOf("lop"));
	}
}
