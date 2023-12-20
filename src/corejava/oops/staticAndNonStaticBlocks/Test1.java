package corejava.oops.staticAndNonStaticBlocks;

class B{
	static {
		System.out.println("static block of B");
	}
	static void m1() {
		System.out.println("m1() of B");
	}
}
public class Test1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(20+10);
		B.m1();
		B.m1();// this is not required because only first time it loads
		System.out.println("main ends");
	}

}
