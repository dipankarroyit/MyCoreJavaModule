package corejava.oops.binding;

class A {
	int i=1;
	static void xyz() {
		System.out.println("static xyz() of A type");
	}
	void m1() {
		System.out.println("non-static m1() of A type");
	}
}
class B extends A {
	int i=2;
	static void xyz() {
		System.out.println("static xyz() of B type");
	}
	void m1() {
		System.out.println("non-static m1() of B type");
	}
}
class C extends A {
	int i=3;
	static void xyz() {
		System.out.println("static xyz() of C type");
	}
	void m1() {
		System.out.println("non-static m1() of C type");
	}
}
public class Test0 {
	public static void main(String[] args) {
		A a1=new B();
		System.out.println(a1.i);
		a1.xyz();
		a1.m1();
		System.out.println("--------------------------");
		a1=new C();
		System.out.println(a1.i);
		a1.xyz();
		a1.m1();
	}
}
