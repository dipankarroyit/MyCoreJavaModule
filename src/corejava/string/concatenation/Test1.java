package corejava.string.concatenation;

public class Test1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ab");
		sb.append("cd");
		System.out.println(sb);
		sb.insert(4, "e");
		System.out.println(sb);
	}
}
