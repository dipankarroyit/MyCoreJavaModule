package corejava.oops.abstraction;
interface A {
	default void m1() {
		System.out.println("m1 method of A");
	}
}
class B implements A {
	public void m1() {
		System.out.println("m1 override method of B");
	}
}
class C implements A {
	
}
public class Test {
	public static void main(String[] args) {
		B b1=new B();
		b1.m1();
		C c1=new C();
		c1.m1();
	}
}
