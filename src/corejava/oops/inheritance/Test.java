package corejava.oops.inheritance;

class E {
	static {
		System.out.println("static block in A type");
	}
}
class F extends E {
	static {
		System.out.println("static block in B type");
	}
}
public class Test {

	public static void main(String[] args) {
		//new E();
		System.out.println("----------------------");
		new F();
	}
}
