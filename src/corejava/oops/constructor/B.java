package corejava.oops.constructor;


public class B {
	public B(int i) {
		System.out.println("executing constructor");
	}
}
class Test1
{
	public static void main(String[] args) {
		new B(10);
//		new B(); // compile time error
	}
}
