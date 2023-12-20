package corejava.oops.constructor;

public class A {
	public A() {
		System.out.println("executing constructor");
	}
}
class Test
{
	public static void main(String[] args) {
		new A();
		System.out.println("---------------------");
		new A();
	}
}
