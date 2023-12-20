package corejava.oops.staticAndNonStaticBlocks;
class D {
	
	{
		System.out.println("non-static block of D loads");
	}
	
	D() {
		System.out.println("default construter loads");
	}
	
	D(int i) {
		System.out.println("int type argumant constructor loads");
	}
	
	D(int i, int j) {
		System.out.println("2 int type argumants constructor loads");
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		new D();
		System.out.println("-----------------------------------------");
		new D(10);
		System.out.println("-----------------------------------------");
		new D(10,20);
	}
}
