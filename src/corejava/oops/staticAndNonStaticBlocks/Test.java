package corejava.oops.staticAndNonStaticBlocks;
class A{
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
}
public class Test {

	public static void main(String[] args) {
		System.out.println("main method");
		// only printing main method because we are not calling class A
	}

}
