package corejava.array.NonPrimitiveArray;

public class Test5 {
	static void m1(Object arg) {
		System.out.println("executing m1");
	}
	public static void main(String[] args) {
		m1(10);
		m1(2.5);
		m1(false);
		m1("abcd");
		m1('c');
	}
}
