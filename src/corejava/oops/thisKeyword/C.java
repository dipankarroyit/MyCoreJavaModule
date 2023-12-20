package corejava.oops.thisKeyword;

public class C {
	int i;
	
	void m1() {
		System.out.println("m1 starts");
		System.out.println(this.i);
		System.out.println("m1 ends");
	}
	void m2() {
		System.out.println("m2 starts");
		this.m1();
		System.out.println("m2 ends");
	}
	public static void main(String[] args) {
		C c1=new C();
		c1.i=10;
		c1.m2();
	}
}
