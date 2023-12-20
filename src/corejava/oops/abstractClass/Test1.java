package corejava.oops.abstractClass;

abstract class A {
	abstract void m1();
	void m2() {
		System.out.println("Concrete m2 method of A type");
	}
}
class B extends A {
	// all the subclass overriding m1 abstract method is mandatory
	void m1() {
		System.out.println("Abstract m1 is overriding in subclass B type");
	}
	// all the subclass overriding m2 concrete  method is not mandatory
	void m2() {
		System.out.println("Concrete m2 is overriding in subclass B type");
	}
}
class C extends A {
	// all the subclass overriding m1 abstract method is mandatory
	void m1() {
		System.out.println("Abstract m1 is overriding in subclass C type");
	}
}
abstract class D extends A {
	// here we are using abstract class so no overriding is required
}
class Test1 {

	public static void main(String[] args) {
		A a1;
		a1=new B();
		a1.m1();
		a1.m2();
		System.out.println("-------------------------------------------");
		a1=new C();
		a1.m1();
	}
}
