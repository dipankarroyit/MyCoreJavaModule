package corejava.oops.staticAndNonStaticBlocks;

class C {
	
	static {
		System.out.println("static block of C");
	}
	
	{
		System.out.println("non-static block of C");
	}
	
	C() {
		System.out.println("default constructor of C");
	}
}

public class Test4 {

	public static void main(String[] args) {
		new C();
		System.out.println("--------------------------");
		new C();
	}
}
