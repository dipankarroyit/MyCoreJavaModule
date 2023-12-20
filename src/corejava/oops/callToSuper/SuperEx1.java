package corejava.oops.callToSuper;
class A {
	A() {
		System.out.println("default constructor of A type");
	}
	A(int i) {
		this();
		System.out.println("parameterized constructor of A type");
	}
}
class B extends A {
	B() {
		System.out.println("default constructor of B type");
	}
	B(int i) {
		this();
		System.out.println("parameterized constructor of B type");
	}
}
class C extends B {
	C() {
		super(10);
		System.out.println("default constructor of C type");
	}
	C(int i) {
		this();
		System.out.println("parameterized constructor of C type");
	}
}
public class SuperEx1 {
	public static void main(String[] args) {
		C c1=new C(10);
	}
}
