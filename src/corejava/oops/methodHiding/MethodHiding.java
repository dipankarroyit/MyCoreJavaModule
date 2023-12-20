package corejava.oops.methodHiding;
class C {
	static void m1() {
		System.out.println("static m1() of C type");
	}
}
// D class static method m1() hides static m1() of C class
class D extends C {
	static void m1() {
		System.out.println("static m1() of D type");
	}
}
class MethodHiding {
	public static void main(String[] args) {
		D.m1();
	}
}
