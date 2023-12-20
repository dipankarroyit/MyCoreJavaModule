package corejava.oops.finalModifier;
class A {
//	final void m1() {
//		System.out.println("m1() calls A type");
//	}
}
class B extends A {
	void m1() {
		System.out.println("m1() calls B type");
	}
}
class FinalEx {
	public static void main(String[] args) {
		B b1=new B();
		b1.m1();
	}
}
