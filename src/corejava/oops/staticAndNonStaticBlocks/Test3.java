package corejava.oops.staticAndNonStaticBlocks;

public class Test3 {
	static int i;
	
	static {
		i=10;// here we are used static block to initialize value of i.
	}
	
	public static void main(String[] args) {
		System.out.println(Test3.i);// here class name is not required
	}
}
