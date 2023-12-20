package corejava.oops.staticAndNonStaticBlocks;

class Block{
	static {
		System.out.println("static block of StaticBlock");
	}
	{
		System.out.println("non-static block of StaticBlock");
	}
}
public class Test6 {
	public static void main(String[] args) {
		Block obj1=new Block();
		System.out.println("add of obj1 = "+obj1);
		System.out.println("-------------------------------------------------------------");
		Block obj2=new Block();
		System.out.println("add of obj2 = "+obj2);
	}
}
