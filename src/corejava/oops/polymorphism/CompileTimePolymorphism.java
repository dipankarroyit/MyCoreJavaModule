package corejava.oops.polymorphism;
class A {
	public void m1(int a) {
		System.out.println("m1 int type parameter method of A type");
	}
	public void m1(double a) {
		System.out.println("m1 double type parameter method of A type");
	}
}
class CompileTimePolymorphism {
	public static void main(String[] args) {
		A a1=new A();
		a1.m1(10.1);// calling double type
		System.out.println("--------------------------------------");
		a1.m1(10);// calling int type
	}
}
